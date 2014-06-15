(ns avaus-tv.prize
  "Prize Service - called by client, calls eligibility service."
  (:require [avaus-tv.eligibility :as es]
            [avaus-tv.channels :as c]))

(defn get-prizes
  "Given account-number and list of channels, check eligibility and return
  list of possible prizes."
  [account-number channels]
  (try
    (if-let [eligible (es/is-eligible account-number)]
      (into []
            (reduce (fn [prizes ch]
                      (if-let [prize (c/prizes ch)]
                        (conj prizes prize)
                        prizes)) #{} channels)))
    (catch avaus.eligibility.InvalidAccountNumberException e
      (throw (avaus.prize.InvalidAccountNumberException.)))
    (catch avaus.eligibility.TechnicalFailureException e
      [])))
