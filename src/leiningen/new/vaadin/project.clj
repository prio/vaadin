(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
		 [com.vaadin/vaadin-server "7.0.3"]
                 [com.vaadin/vaadin-client-compiled "7.0.3"]
                 [com.vaadin/vaadin-themes "7.0.3"]
                 [javax.servlet/servlet-api "2.5"]]
  :aot [{{name}}.{{name}}ui]
  :plugins [[lein-servlet "0.3.0"]]
  
  :servlet {:deps [[lein-servlet/adapter-jetty7 "0.3.0"]]
            :config {:engine :jetty
                     :host "localhost"
                     :port 3000}
            :webapps {"/"
                       {:web-xml "src/main/webapp/WEB-INF/web.xml"
                        :public "resources"}}})
