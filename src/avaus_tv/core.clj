(ns avaus-tv.core
  "Simulate the client for the prize service."
  (:require [avaus-tv.channels :as c]
            [avaus-tv.prize :as p])
  (:gen-class))

(defn -main
  "Arguments: account-number and list of channels."
  [& [account-number & channels]]
  (try
    (let [account-number (Long/parseLong account-number)
          channels       (map keyword channels)
          prizes         (p/get-prizes account-number channels)]
      (println "Account" account-number "with" channels
               (if (seq prizes)
                 (str "can choose from " prizes)
                 "is not eligible for a prize")))
    (catch avaus.prize.InvalidAccountNumberException e
      (println "That account number is invalid!"))
    (catch Exception e
      (println "Sorry, an exception occurred:" (.toString e)))))

