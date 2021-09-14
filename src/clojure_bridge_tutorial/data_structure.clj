(ns clojure-bridge-tutorial.data_structure)

(defn -main
  []
  (println [1 2 3 4 5])
  ; vector
  (println (vector 1 2 3))
  (println (conj [1 2] 3))
  (println (count [1 2 3]))
  (println (nth [1 2 3] 1))
  (println (first [1 2 3]))
  (println (rest [1 2 3]))
  ; map
  (def nameMap {:first "Sally" :last "Brown"})
  (println (assoc {:first "Sally"} :last "Brown"))
  (println (dissoc {:first "Sally" :last "Brown"} :last))
  (println (merge {:first "Sally"} {:last "Brown"}))
  (println (count nameMap))
  (println (get nameMap :first))
  (println (get nameMap :second :defaultValue))
  (println (keys nameMap))
  (println (vals nameMap))
  (def hello {:count 1 :words "hello"})
  (println (update hello :count inc))
  (println (update hello :words str " world!"))
  (def mine {:pet {:age 5 :name "able"}})
  (println (update-in mine [:pet :age] - 3))
  (def states [{:neo {:x 21.213202971967114, :y 21.213203899225725, :angle 45, :color [0 64 0]}}
                {:oracle {:x -49.99999999999981, :y -4.3711390001862375E-6, :angle 180, :color [43 101 236]}}])
  (def firstStates (first states))
  (println (get firstStates :neo))
  (println (get-in firstStates [:neo, :angle])))

