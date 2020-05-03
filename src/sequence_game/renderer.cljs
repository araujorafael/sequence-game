(ns sequence-game.renderer
  (:require [reagent.core :as r]
            [reagent.dom  :as rdom]))

(def clicked-state (r/atom 0))

(defn- clicked-action []
  (swap! clicked-state inc)
  (js/console.log "CLICKED"))

(defn hello-html []
  [:div
    "The " [:code "clicked-qtd"] " has value: " @clicked-state ". "
   [:button
    {:value "CLICK ME"
     :on-click clicked-action}
    "!CLICK ME MATE!"]])

(defn start []
  (js/console.log "Starting application")
  (rdom/render
     [hello-html]
     (.getElementById js/document "app")))

(defn ^:dev/after-load after []
  (start))

(defn init []
  (js/console.log "renderer - init")
  (start))

(defn stop []
  (js/console.log "renderer - stop"))
