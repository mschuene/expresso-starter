(ns expresso-test.core
  (:require [numeric.expresso.core :as expresso]))

(defn foo
  "I don't do a whole lot."
  [x]
  (expresso/ex (+ 1 ~x 3)))
