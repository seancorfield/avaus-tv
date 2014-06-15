(ns avaus-tv.eligibility
  "Eligibility Service - Mock, since service is not ready yet.")

(defn is-eligible
  "Given an account number, either return true/false for eligibility,
  or throw an exception for invalid account number or other technical failure."
  [account-number]
  ;; to simulate mock behavior, if account-number is 1..100 we say it
  ;; is eligible, 101..200 we say it is not eligible, 201..300 we
  ;; throw a technical failure and otherwise invalid account number
  (cond (<=   1 account-number 100) true
        (<= 101 account-number 200) false
        (<= 201 account-number 300) (throw (ex-info "TechnicalFailure" {}))
        :else                       (throw (ex-info "InvalidAccountNumber" {}))))