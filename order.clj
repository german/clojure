(defn p [] (p))

(defn test2 [x y] (
  (if (= 0 x) 
    0
    y
  )
))

(test2 0 (p))
