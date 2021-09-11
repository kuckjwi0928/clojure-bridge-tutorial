(ns clojure-bridge-tutorial.simple_values)

(defn -main
  []
  ; string
  (println "Hello, World!")
  ; int
  (println 1 2 3)
  ; decimal
  (println 1.0 2.0 3.0)
  ; boolean and nil
  (println true false nil)
  ; fraction operator
  (println (+ 4/3 7/8))
  ; plus
  (println (+ 1 2))
  ; minus
  (println (- 5 2))
  ; multiply
  (println (* 5 2))
  ; divide
  (println (/ 27 3))
  ; prefix (infix: 1 + 3 / 3)
  (println (+ 1 (/ 3 3)))
  ; value assign
  (def one 1)
  (def two 2)
  (println (+ one two)))
