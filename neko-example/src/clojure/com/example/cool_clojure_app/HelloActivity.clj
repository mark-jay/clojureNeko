(ns com.example.cool_clojure_app.HelloActivity
  (:gen-class :main false
              :extends android.app.Activity
              :exposes-methods {onCreate superOnCreate})
  ;(:import [com.example.cool_clojure_app R$layout])
  )

(comment
(defn -onCreate
  [this bundle]
  (doto this
    (.superOnCreate bundle)
    (.setContentView R$layout/main)))
)