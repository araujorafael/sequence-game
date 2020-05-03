(ns sequence-game.components.grid)

(defn square-html []
  [:li {:style {:min-width "100px"
                :max-width "100px"
                :height "100px"
                :border "1px solid black"
                :border-radius "3px"
                :display "inline-block"
                :margin "4px 4px"
                :flex-direction "row"
                :flex-grow 3}}])

(defn grid-render [squares-qtd]
  [:ul {:style {:display "flex"
                :flex-wrap "wrap"
                :width "70%"
                :margin "auto"}}

   (for [_ (range 0 (* squares-qtd 2))]
     (square-html))])
