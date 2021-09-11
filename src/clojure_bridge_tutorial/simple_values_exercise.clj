(ns clojure-bridge-tutorial.simple_values_exercise)

(defn -main
  []
  ; Convert minute to second
  (def minute 1)
  (println (* minute 60))
  ; Convert 1000 seconds to minutes and seconds.
  ; quotient
  (println (quot 1000 60) "minute")
  ; remainder
  (println (rem 1000 60) "second"))
