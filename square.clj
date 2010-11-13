(ns sicp)

(defn average [a b] (/ (+ a b) 2.0))

(defn abs [a] (if (> a 0) a (- a)))

(defn is_good_enough? [x guess] 
  (< (abs (- (* guess guess) x)) 0.0001) 
)

(defn square-func [x guess]
      
    (if (is_good_enough? x guess) 
      guess
      (square-func x (average (/ x guess) guess))
    )
  
)

(defn square [x] (square-func x 1.0))

(print (square 9.0))
