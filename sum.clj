(defn factorial2 [n] 
  (if (= 1 n) 
    1
    (* n (factorial2 (- n 1)))
  )
)

(print (factorial2 5))

(print (factorial2 122))

(defn factor-iter [product counter max-counter]
  (if (> counter max-counter) 
    product
    (factor-iter (* counter product) (+ counter 1) max-counter)
  )
)

(defn factorial [n] (factor-iter 1 1 n))

(print (factorial 5))

(print (factorial 122))
