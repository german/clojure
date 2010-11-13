(defn factorial2 [n] 
  (if (= 1 n) 
    1
    (* n (factorial2 (- n 1)))
  )
)

(println (factorial2 5))

(println (factorial2 122))

(defn factor-iter [product counter max-counter]
  (if (> counter max-counter) 
    product
    (factor-iter (* counter product) (+ counter 1) max-counter)
  )
)

(defn factorial [n] (factor-iter 1 1 n))

(println (factorial 5))

(println (factorial 122))
