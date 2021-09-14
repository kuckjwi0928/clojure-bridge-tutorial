(ns clojure-bridge-tutorial.data_structure_exercise)

(defn -main
  []
  (def temperatures [23 23 25 26 25 23 23])
  (println (nth temperatures 3))
  (def kuckjwi (merge {:firstName "Kuckhwan" :lastName "Cho"} {:hometown "Namyangju"}))
  (def infos [kuckjwi])
  (println (conj infos {:firstName "kuckjwi" :lastName "Cho" :hometown "Namyangju"}))
)
