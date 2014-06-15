(ns avaus-tv.exceptions
  "Placeholder for custom exceptions.")

(gen-class :name avaus.prize.InvalidAccountNumberException
           :extends java.lang.Exception)

(gen-class :name avaus.eligibility.InvalidAccountNumberException
           :extends java.lang.Exception)

(gen-class :name avaus.eligibility.TechnicalFailureException
           :extends java.lang.Exception)
