(ns leiningen.new.vaadin
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "vaadin"))

(defn vaadin
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' vaadin project.")
    (->files data
             ["project.clj" (render "project.clj" data)]
             ["src/{{sanitized}}/{{name}}ui.clj" (render "applicationui.clj" data)]
             ["src/main/webapp/WEB-INF/web.xml" (render "web.xml" data)])))
