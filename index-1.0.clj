{:namespaces
 ({:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/bayes.clj",
   :wiki-url "http://liebke.github.com/incanter/bayes-api.html",
   :name "incanter.bayes",
   :author "David Edgar Liebke",
   :doc
   "This is library provides functions for performing\nbasic Bayesian modeling and inference.\n"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/censored.clj",
   :wiki-url "http://liebke.github.com/incanter/censored-api.html",
   :name "incanter.censored",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj",
   :wiki-url "http://liebke.github.com/incanter/charts-api.html",
   :name "incanter.charts",
   :author "David Edgar Liebke",
   :doc
   "This is the core charting library for Incanter.\nIt provides basic scatter plots, histograms, box plots\nxy plots, bar charts, line charts, as well as\nspecialized charts like trace plots and Bland-Altman\nplots.\n\nThis library is built on the JFreeChart library\n(http://www.jfree.org/jfreechart/).\n"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj",
   :wiki-url "http://liebke.github.com/incanter/chrono-api.html",
   :name "incanter.chrono",
   :author "Matt Moriarity, Phil Hagelberg, and Bradford Cross",
   :doc
   "\n chrono.clj --- Because calling it date-utils would be boring.\n\n Use the date function to create dates. You can look up components\n much like you would in a map:\n\n(def my-date (date 2009 2 27 12 34 56))\n\n(my-date :year)   ;; 2009\n(my-date :month)  ;; 2\n(my-date :day)    ;; 27\n(my-date :hour)   ;; 12\n(my-date :minute) ;; 34\n(my-date :second) ;; 56\n\n You may omit the time if you like:\n\n(def my-other-date (date 2009 2 27))\n(my-other-date :hour) ;; 0\n\n To get a date relative to another date, use earlier and later:\n\n(earlier my-date 100 :minute) ;; 2009 2 27 10:54:56\n(later my-other-date 10 :day) ;; 2009 3 9\n\n For comparing dates, use earlier? and later?:\n\n(earlier? my-date my-other-date) ;; false\n(later? (later my-date 10 :day) my-date) ;; true\n\n You can see the time between two dates by calling time-between:\n\n(time-between my-other-date (date 2009 2 25) :days) ;; 2\n\nThe date-seq function returns a lazy seq of dates incrementing by\nthe units in its first arg starting from its second arg. The third\narg if given dictates the end of the sequence.\n\n(date-seq :hours my-other-date my-date) ;; (a seq of twelve hours)\n(take 4 (date-seq :years my-date))\n;; (date 2009 2 27 12 34 56) (date 2010 2 27 12 34 56)\n;; (date 2011 2 27 12 34 56) (date 2012 2 27 12 34 56) [...]\n\n For converting between strings and dates, use format-date and\n parse-date\n\n(format-date my-date :short-date-time) ;; 2/27/09 12:34 PM\n(format-date my-other-date :long-date) ;; February 27, 2009\n(parse-date \"12/25/09\" :short-date) ;; (date 2009 12 25)\n(parse-date \"January 1, 2008 1:45:23 PM EST\" :long-date-time)\n;; (date 2008 1 1 13 45 23)\n\nSupported date formats are:\n  iso8601\n  short-date\n  medium-date\n  long-date\n  full-date\n  short-date-time\n\nBoth format-date and parse-date also support a string for the\nformat argument, which will use the string as the format for a\nSimpleDateFormat (see the javadocs of that class for how to write\nthese formats).\n\nSee test_contrib/chrono.clj for more details.\n\n TODO:\n\n* Timezones\n* More support for weeks\n* Various others scattered through code\n\n"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj",
   :wiki-url
   "http://liebke.github.com/incanter/classification-api.html",
   :name "incanter.classification",
   :doc
   "\nfundamentals of classification, cross validation, and performance measures such as precision and recall.\n\nclassifiers are maps of classifier-name -> functions, data are maps of feature-name features."}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/core.clj",
   :wiki-url "http://liebke.github.com/incanter/core-api.html",
   :name "incanter.core",
   :author "David Edgar Liebke",
   :doc
   "This is the core numerics library for Incanter.\nIt provides functions for vector- and matrix-based\nmathematical operations and the core data manipulation\nfunctions for Incanter.\n\nThis library is built on Parallel Colt\n(http://sites.google.com/site/piotrwendykier/software/parallelcolt)\nan extension of the Colt numerics library\n(http://acs.lbl.gov/~hoschek/colt/).\n"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/datasets.clj",
   :wiki-url "http://liebke.github.com/incanter/datasets-api.html",
   :name "incanter.datasets",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/incremental_stats.clj",
   :wiki-url
   "http://liebke.github.com/incanter/incremental-stats-api.html",
   :name "incanter.incremental-stats",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/information_theory.clj",
   :wiki-url
   "http://liebke.github.com/incanter/information-theory-api.html",
   :name "incanter.information-theory",
   :doc
   "\n\nTODO: docs - describe representations taht these measures expect.\n\nTODO\nother divergences and distances that can be described as kl divergences\nhttp://en.wikipedia.org/wiki/Hellinger_distance\ninteraction information\nhttp://en.wikipedia.org/wiki/Interaction_information\nhttp://en.wikipedia.org/wiki/Kirkwood_approximation\nhttp://en.wikipedia.org/wiki/F-divergence\nhttp://en.wikipedia.org/wiki/Statistical_distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/internal.clj",
   :wiki-url "http://liebke.github.com/incanter/internal-api.html",
   :name "incanter.internal",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/io.clj",
   :wiki-url "http://liebke.github.com/incanter/io-api.html",
   :name "incanter.io",
   :doc
   "\nlib for handy io goodness.\n\n-ability to pretty print reports of various models\n-read in clojure and json literals in different ways; files, classpath resources, etc.\n-support for csv and sql\n\n\nhttp://stackoverflow.com/questions/613929/how-do-i-connect-to-a-mysql-database-from-clojure\n\n;;example sql transformation\n\n (def stuff (sql-select \n  (sql-unique \"something\") \n  (sql-where (str \"something = \"something\"))\n  (sql-from \"mytable\"))\n  (sql-order-by \"foo, bar\")))\n\n (defn transform-query [t q] #(with-query-results res [(q %)] (t res)))\n\n (defn sql-transformer [key-query\n\t\t       transform\n\t\t       view-query\n\t\t       output-file]\n  (with-data key-query\n    #(with-out-writer output-file\n        (dorun (do-for :something % (transform-query transform view-query))))))\n\n (defn sql-to-hadoop [transform]\n  (sql-transformer stuff transform myview \"/target/dir/preprocessed.pre\"))\n\n (defn transform-dates [] (sql-to-hadoop #(binding [*print-dup* true] (prn (preprocess %)))))"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/mongodb.clj",
   :wiki-url "http://liebke.github.com/incanter/mongodb-api.html",
   :name "incanter.mongodb",
   :author "David Edgar Liebke",
   :doc
   "A simple library that provides functions for persisting \nIncanter data structures using MongoDB.\n\nUse incanter.mongodb in combination with the somnium.congomongo library. \nFor usage examples, see the Congomongo README at http://github.com/somnium/congomongo, \nand the examples/blog/mongodb_datasets.clj file in the Incanter distribution. \n\nHere are Somnium's descriptions of Congomongo's functions:\n\n  (mongo! & args) : Creates a Mongo object and sets the default database.\n     Keyword arguments include:\n     :host -> defaults to localhost\n     :port -> defaults to 27017\n     :db   -> defaults to nil (you'll have to set it anyway, might as well do it now.)\n\n  (get-coll coll) : Returns a DBCollection object\n\n  (fetch coll & options) : Fetches objects from a collection. Optional arguments include\n   :where  -> takes a query map\n   :only   -> takes an array of keys to retrieve\n   :as     -> what to return, defaults to :clojure, can also be :json or :mongo\n   :from   -> argument type, same options as above\n   :one?   -> defaults to false, use fetch-one as a shortcut\n   :count? -> defaults to false, use fetch-count as a shortcut\n\n  (fetch-one coll & options) : same as (fetch collection :one? true)\n\n  (fetch-count coll & options) : same as (fetch collection :count? true)\n\n  (insert! coll obj & options) : Inserts a map into collection. Will not overwrite existing maps.\n   Takes optional from and to keyword arguments. To insert\n   as a side-effect only specify :to as nil.\n\n  (mass-insert! coll objs & options) : Inserts a sequence of maps.\n\n  (update! coll old new & options) : Alters/inserts a map in a collection. Overwrites existing objects.\n   The shortcut forms need a map with valid :_id and :_ns fields or\n   a collection and a map with a valid :_id field.\n\n  (destroy! coll query-map) : Removes map from collection. Takes a collection name and\n    a query map\n\n  (add-index! coll fields & options) : Adds an index on the collection for the specified fields if it does not exist.\n    Options include:\n    :unique -> defaults to false\n    :force  -> defaults to true\n\n  (drop-index! coll fields) : Drops an index on the collection for the specified fields\n\n  (drop-all-indexes! coll) : Drops all indexes from a collection\n\n  (get-indexes coll & options) : Get index information on collection\n\n  (drop-database title) : drops a database from the mongo server\n\n  (set-database title) : atomically alters the current database\n\n  (databases) : List databases on the mongo server\n\n  (collections) : Returns the set of collections stored in the current database\n\n  (drop-collection coll) : Permanently deletes a collection. Use with care."}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/optimize.clj",
   :wiki-url "http://liebke.github.com/incanter/optimize-api.html",
   :name "incanter.optimize",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/pdf.clj",
   :wiki-url "http://liebke.github.com/incanter/pdf-api.html",
   :name "incanter.pdf",
   :doc
   "This library currently has only a single function, save-pdf, which saves\ncharts as a PDF file. To build this namespace make sure the you have the iText\nlibrary (http://itextpdf.com/) as a declared dependency in your pom.xml or \nproject.clj file:\n[com.lowagie/itext \"1.4\"] "}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/probability.clj",
   :wiki-url "http://liebke.github.com/incanter/probability-api.html",
   :name "incanter.probability",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/processing.clj",
   :wiki-url "http://liebke.github.com/incanter/processing-api.html",
   :name "incanter.processing",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/som.clj",
   :wiki-url "http://liebke.github.com/incanter/som-api.html",
   :name "incanter.som",
   :doc nil}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/stats.clj",
   :wiki-url "http://liebke.github.com/incanter/stats-api.html",
   :name "incanter.stats",
   :author "David Edgar Liebke and Bradford Cross",
   :doc
   "This is the core statistical library for Incanter.\nIt provides probability functions (cdf, pdf, quantile),\nrandom number generation, statistical tests, basic\nmodeling functions, similarity/association measures,\nand more.\n\nThis library is built on Parallel Colt \n(http://sites.google.com/site/piotrwendykier/software/parallelcolt),\nan extension of the Colt numerics library \n(http://acs.lbl.gov/~hoschek/colt/).\n"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/transformations.clj",
   :wiki-url
   "http://liebke.github.com/incanter/transformations-api.html",
   :name "incanter.transformations",
   :doc nil}),
 :vars
 ({:source-url
   "http://github.com/liebke/incanter/blob/77fddb304e133b7feeb5f290a2d6afd061506a58/modules/incanter-core/src/main/clojure/incanter/bayes.clj#L36",
   :wiki-url
   "http://liebke.github.com/incanter//bayes-api.html#incanter.bayes/sample-model-params",
   :namespace "incanter.bayes",
   :line 36,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/bayes.clj",
   :var-type "function",
   :arglists ([size linear-model]),
   :doc
   " Returns a sample of the given size of the the parameters (coefficients and\nerror variance) of the given linear-model. The sample is generated using\nGibbs sampling.\n\nSee also:\n  incanter.stats/linear-model\n\nExamples:\n  (use '(incanter core datasets stats charts bayes))\n\n  (def ols-data (to-matrix (get-dataset :survey)))\n  (def x (sel ols-data (range 0 2313) (range 1 10)))\n  (def y (sel ols-data (range 0 2313) 10))\n  (def lm (linear-model y x :intercept false))\n  (def param-samp (sample-model-params 5000 lm))\n\n  ;; view trace plots\n  (view (trace-plot (:var param-samp )))\n  (view (trace-plot (sel (:coefs param-samp) :cols 0)))\n\n  ;; view histograms\n  (view (histogram (:var param-samp)))\n  (view (histogram (sel (:coefs param-samp) :cols 0)))\n\n  ;; calculate statistics\n  (map mean (trans (:coefs param-samp)))\n  (map median (trans (:coefs param-samp)))\n  (map sd (trans (:coefs param-samp)))\n\n  ;; show the 95% bayesian confidence interval for the firt coefficient\n  (quantile (sel (:coefs param-samp) :cols 0) :probs [0.025 0.975])",
   :name "sample-model-params"}
  {:source-url
   "http://github.com/liebke/incanter/blob/77fddb304e133b7feeb5f290a2d6afd061506a58/modules/incanter-core/src/main/clojure/incanter/bayes.clj#L100",
   :wiki-url
   "http://liebke.github.com/incanter//bayes-api.html#incanter.bayes/sample-multinomial-params",
   :namespace "incanter.bayes",
   :line 100,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/bayes.clj",
   :var-type "function",
   :arglists ([size counts]),
   :doc
   " Returns a sample of multinomial proportion parameters.\nThe counts are assumed to have a multinomial distribution.\nA uniform prior distribution is assigned to the multinomial vector\ntheta, then the posterior distribution of theta is\nproportional to a dirichlet distribution with parameters\n(plus counts 1).\n\n\nExamples:\n  (use '(incanter core stats bayes charts))\n\n  (def  samp-props (sample-multinomial-params 1000 [727 583 137]))\n\n  ;; view means, 95% CI, and histograms of the proportion parameters\n  (mean (sel samp-props :cols 0))\n  (quantile (sel samp-props :cols 0) :probs [0.0275 0.975])\n  (view (histogram (sel samp-props :cols 0)))\n  (mean (sel samp-props :cols 1))\n  (quantile (sel samp-props :cols 1) :probs [0.0275 0.975])\n  (view (histogram (sel samp-props :cols 1)))\n  (mean (sel samp-props :cols 2))\n  (quantile (sel samp-props :cols 2) :probs [0.0275 0.975])\n  (view (histogram (sel samp-props :cols 2)))\n\n  ;; view  a histogram of the difference in proportions between the first\n  ;; two candidates\n  (view (histogram (minus (sel samp-props :cols 0) (sel samp-props :cols 1))))",
   :name "sample-multinomial-params"}
  {:source-url
   "http://github.com/liebke/incanter/blob/77fddb304e133b7feeb5f290a2d6afd061506a58/modules/incanter-core/src/main/clojure/incanter/bayes.clj#L93",
   :wiki-url
   "http://liebke.github.com/incanter//bayes-api.html#incanter.bayes/sample-proportions",
   :namespace "incanter.bayes",
   :line 93,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/bayes.clj",
   :var-type "function",
   :arglists ([size counts]),
   :doc
   " sample-proportions has been renamed sample-multinomial-params",
   :name "sample-proportions"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L57",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/censored-mean-lower",
   :namespace "incanter.censored",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([a mu sigma]),
   :doc
   " Returns the mean of a normal distribution (with mean mu and standard\ndeviation sigma) with the lower tail censored at 'a'",
   :name "censored-mean-lower"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L22",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/censored-mean-two-sided",
   :namespace "incanter.censored",
   :line 22,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([a b mu sigma]),
   :doc
   " Returns the mean of a normal distribution (with mean mu and standard\ndeviation sigma) with the lower tail censored at 'a' and the upper\ntail censored at 'b'",
   :name "censored-mean-two-sided"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L85",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/censored-mean-upper",
   :namespace "incanter.censored",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([b mu sigma]),
   :doc
   " Returns the mean of a normal distribution (with mean mu and standard\ndeviation sigma) with the upper tail censored at 'b'",
   :name "censored-mean-upper"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L68",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/censored-variance-lower",
   :namespace "incanter.censored",
   :line 68,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([a mu sigma]),
   :doc
   " Returns the variance of a normal distribution (with mean mu and standard\ndeviation sigma) with the lower tail censored at 'a'",
   :name "censored-variance-lower"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L37",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/censored-variance-two-sided",
   :namespace "incanter.censored",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([a b mu sigma]),
   :doc
   " Returns the variance of a normal distribution (with mean mu and standard\ndeviation sigma) with the lower tail censored at 'a' and the upper\ntail censored at 'b'",
   :name "censored-variance-two-sided"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L95",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/censored-variance-upper",
   :namespace "incanter.censored",
   :line 95,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([b mu sigma]),
   :doc
   " Returns the variance of a normal distribution (with mean mu and standard\ndeviation sigma) with the upper tail censored at 'b'",
   :name "censored-variance-upper"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/censored.clj#L112",
   :wiki-url
   "http://liebke.github.com/incanter//censored-api.html#incanter.censored/truncated-variance",
   :namespace "incanter.censored",
   :line 112,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/censored.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   " Returns the variance of a normal distribution truncated at a and b.\n\nOptions:\n  :mean (default 0) mean of untruncated normal distribution\n  :sd (default 1) standard deviation of untruncated normal distribution\n  :a (default -infinity) lower truncation point\n  :b (default +infinity) upper truncation point\n\nExamples:\n\n  (use '(incanter core stats))\n  (truncated-variance :a -1.96 :b 1.96)\n  (truncated-variance :a 0)\n  (truncated-variance :b 0)\n\n  (use 'incanter.charts)\n  (def x (range -3 3 0.1))\n  (def plot (xy-plot x (map #(truncated-variance :a %) x)))\n  (view plot)\n  (add-lines plot x (map #(truncated-variance :b %) x))\n\n  (def samp (sample-normal 10000))\n  (add-lines plot x (map #(variance (filter (fn [s] (> s %)) samp)) x))\n  (add-lines plot x (map #(variance (mult samp (indicator (fn [s] (> s %)) samp))) x))\n\n\nReferences:\n  DeMaris, A. (2004) Regression with social data: modeling continuous and limited response variables.\n    Wiley-IEEE.\n\n  http://en.wikipedia.org/wiki/Truncated_normal_distribution",
   :name "truncated-variance"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L175",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-box-plot",
   :namespace "incanter.charts",
   :line 175,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([chart x & options]),
   :doc
   "\nAdds an additional box to an existing box-plot, returns the modified chart object.\n\nOptions:\n  :series-label (default x expression)\n\nExamples:\n\n    (use '(incanter core charts stats))\n    (doto (box-plot (sample-normal 1000) :legend true)\n          view\n          (add-box-plot (sample-normal 1000 :sd 2))\n          (add-box-plot (sample-gamma 1000)))\n\n\n   (with-data (get-dataset :iris)\n     (doto (box-plot :Sepal.Length :legend true)\n       (add-box-plot :Petal.Length)\n       (add-box-plot :Sepal.Width)\n       (add-box-plot :Petal.Width)\n       view))\n\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "add-box-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L245",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-categories",
   :namespace "incanter.charts",
   :line 245,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([chart categories values & options]),
   :doc
   "\nAdds an additional categories to an existing bar-chart or line-chart, returns the modified chart object.\n\nOptions:\n  :group-by\n  :series-label\n\nExamples:\n\n    (use '(incanter core charts stats datasets))\n    (def seasons (mapcat identity (repeat 3 [\"winter\" \"spring\" \"summer\" \"fall\"])))\n    (def years (mapcat identity (repeat 4 [2007 2008 2009])))\n    (def x (sample-uniform 12 :integers true :max 100))\n    (def plot (bar-chart years x :group-by seasons :legend true))\n    (view plot)\n    (add-categories plot years [10 20 40] :series-label \"winter-break\")\n\n    (add-categories plot \n                       (plus 3 years) \n                       (sample-uniform 12 :integers true :max 100) \n                       :group-by seasons)\n\n    (def plot2 (line-chart years x :group-by seasons :legend true))\n    (view plot2)\n    (add-categories plot2 (plus 3 years) (sample-uniform 12 :integers true :max 100) :group-by seasons)\n\n    (with-data (get-dataset :iris)\n      (doto (line-chart :Species :Sepal.Length \n                        :data ($rollup mean :Sepal.Length :Species)\n                        :legend true)\n        (add-categories :Species :Sepal.Width :data ($rollup mean :Sepal.Width :Species))\n        (add-categories :Species :Petal.Length :data ($rollup mean :Petal.Length :Species))\n        (add-categories :Species :Petal.Width :data ($rollup mean :Petal.Width :Species))\n        view))\n\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "add-categories"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L391",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-function",
   :namespace "incanter.charts",
   :line 391,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([chart function min-range max-range & options]),
   :doc
   " Adds a xy-plot of the given function to the given chart, returning\na modified version of the chart.\n\nOptions:\n  :series-label (default x expression)\n  :step-size (default (/ (- max-range min-range) 500))\n\nSee also:\n  function-plot, view, save, add-function, add-points, add-lines\n\n\nExamples:\n\n  (use '(incanter core stats charts))\n\n  ;; plot the sine and cosine functions\n  (doto (function-plot sin (- Math/PI) Math/PI)\n        (add-function cos (- Math/PI) Math/PI)\n        view)\n\n\n  ;; plot two normal pdf functions\n  (doto (function-plot pdf-normal -3 3 :legend true)\n        (add-function (fn [x] (pdf-normal x :mean 0.5 :sd 0.5)) -3 3)\n        view)\n\n\n  ;; plot a user defined function and its derivative\n  (use '(incanter core charts optimize))\n\n  ;; define the function, x^3 + 2x^2 + 2x + 3\n  (defn cubic [x] (+ (* x x x) (* 2 x x) (* 2 x) 3))\n\n  ;; use the derivative function to get a function\n  ;; that approximates its derivative\n  (def deriv-cubic (derivative cubic))\n\n  ;; plot the cubic function and its derivative\n  (doto (function-plot cubic -10 10)\n        (add-function deriv-cubic -10 10)\n        view)",
   :name "add-function"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L119",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-histogram",
   :namespace "incanter.charts",
   :line 119,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([chart x & options]),
   :doc
   "\nAdds a histogram to an existing histogram plot, returns the modified\nchart object.\n\nOptions:\n  :nbins (default 10) number of bins for histogram\n  :series-label (default x expression)\n\nExamples:\n\n  (use '(incanter core charts stats datasets))\n  (doto (histogram (sample-normal 1000)\n                   :legend true)\n        view\n        (add-histogram (sample-normal 1000 :sd 0.5)))\n\n\n  (with-data (get-dataset :iris)\n    (doto (histogram :Sepal.Length :legend true)\n      (add-histogram :Petal.Length)\n      view))\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "add-histogram"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L324",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-lines",
   :namespace "incanter.charts",
   :line 324,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([chart x y & options]),
   :doc
   " Plots lines on the given scatter or line plot of the (x,y) points.\nEquivalent to R's lines function, returns the modified chart object.\n\nOptions:\n  :series-label (default x expression)\n\nExamples:\n\n  (use '(incanter core stats io datasets charts))\n  (def cars (to-matrix (get-dataset :cars)))\n  (def y (sel cars :cols 0))\n  (def x (sel cars :cols 1))\n  (def plot1 (scatter-plot x y :legend true))\n  (view plot1)\n\n  ;; add regression line to scatter plot\n  (def lm1 (linear-model y x))\n  (add-lines plot1 x (:fitted lm1))\n\n  ;; model the data without an intercept\n  (def lm2 (linear-model y x :intercept false))\n  (add-lines plot1 x (:fitted lm2))\n\n\n  ;; Clojure's doto macro can be used to build a chart\n  (doto (histogram (sample-normal 1000) :density true)\n        (add-lines (range -3 3 0.05) (pdf-normal (range -3 3 0.05)))\n        view)\n\n\n  (with-data (get-dataset :iris)\n      (doto (xy-plot :Sepal.Width :Sepal.Length :legend true)\n            (add-lines :Petal.Width :Petal.Length)\n            view))\n\n\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "add-lines"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1430",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-pointer",
   :namespace "incanter.charts",
   :line 1430,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart x y & options]),
   :doc
   " Adds an arrow annotation to the given chart.\n\nArguments:\n  chart -- the chart to annotate\n  x, y -- the coordinate to add the annotation\n\n\nOptions:\n    :text -- (default \"\") text to include at the end of the arrow\n    :angle -- (default :nw) either a number indicating the angle of the arrow\n              or a keyword indicating a direction (:north :nw :west :sw :south\n              :se :east :ne)\n\n\nExamples:\n\n  (use '(incanter core charts))\n  (def x (range (* -2 Math/PI) (* 2 Math/PI) 0.01))\n  (def plot (xy-plot x (sin x)))\n  (view plot)\n  ;; annotate the plot\n  (doto plot\n    (add-pointer (- Math/PI) (sin (- Math/PI)) :text \"(-pi, (sin -pi))\")\n    (add-pointer Math/PI (sin Math/PI) :text \"(pi, (sin pi))\" :angle :ne)\n    (add-pointer (* 1/2 Math/PI) (sin (* 1/2 Math/PI)) :text \"(pi/2, (sin pi/2))\" :angle :south))\n\n  ;; try the different angle options\n  (add-pointer plot 0 0 :text \"north\" :angle :north)\n  (add-pointer plot 0 0 :text \"nw\" :angle :nw)\n  (add-pointer plot 0 0 :text \"ne\" :angle :ne)\n  (add-pointer plot 0 0 :text \"west\" :angle :west)\n  (add-pointer plot 0 0 :text \"east\" :angle :east)\n  (add-pointer plot 0 0 :text \"south\" :angle :south)\n  (add-pointer plot 0 0 :text \"sw\" :angle :sw)\n  (add-pointer plot 0 0 :text \"se\" :angle :se)",
   :name "add-pointer"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L470",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-points",
   :namespace "incanter.charts",
   :line 470,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([chart x y & options]),
   :doc
   " Plots points on the given scatter-plot or xy-plot of the (x,y) points.\nEquivalent to R's lines function, returns the modified chart object.\n\nOptions:\n  :series-label (default x expression)\n\nExamples:\n\n  (use '(incanter core stats io datasets charts))\n  (def cars (to-matrix (get-dataset :cars)))\n  (def y (sel cars :cols 0))\n  (def x (sel cars :cols 1))\n\n  ;; add regression line to scatter plot\n  (def lm1 (linear-model y x))\n  ;; model the data without an intercept\n  (def lm2 (linear-model y x :intercept false))\n\n  (doto (xy-plot x (:fitted lm1) :legend true)\n        view\n        (add-points x y)\n        (add-lines x (:fitted lm2)))\n\n\n  (with-data (get-dataset :iris)\n    (doto (scatter-plot :Sepal.Length :Sepal.Width :data ($where {:Species \"setosa\"}))\n          (add-points :Sepal.Length :Sepal.Width :data ($where {:Species \"versicolor\"}))\n          (add-points :Sepal.Length :Sepal.Width :data ($where {:Species \"virginica\"}))\n          view))\n\n  ;; of course this chart can be achieved in a single line:\n  (view (scatter-plot :Sepal.Length :Sepal.Width :group-by :Species :data (get-dataset :iris)))\n\n\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "add-points"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1564",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-polygon",
   :namespace "incanter.charts",
   :line 1564,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart coords & options]),
   :doc
   " Adds a polygon outline defined by a given coordinates. The last coordinate will\nclose with the first. If only two points are given, it will plot a line.\n\nArguments:\n  chart -- the chart to add the polygon to.\n  coords -- a list of coords (an n-by-2 matrix can also be used)\n\n\nExamples:\n  (use '(incanter core stats charts))\n  (def x (range -3 3 0.01))\n  (def plot (xy-plot x (pdf-normal x)))\n  (view plot)\n\n  ;; add polygon to the chart\n  (add-polygon plot [[-1.96 0] [1.96 0] [1.96 0.4] [-1.96 0.4]])\n  ;; the coordinates can also be passed in a matrix\n  ;; (def points (matrix [[-1.96 0] [1.96 0] [1.96 0.4] [-1.96 0.4]]))\n  ;; (add-polygon plot points)\n  ;; add a text annotation\n  (add-text plot -1.25 0.35 \"95% Conf Interval\")\n\n  ;; PCA chart example\n  (use '(incanter core stats charts datasets))\n  ;; load the iris dataset\n  (def iris (to-matrix (get-dataset :iris)))\n  ;; run the pca\n  (def pca (principal-components (sel iris :cols (range 4))))\n  ;; extract the first two principal components\n  (def pc1 (sel (:rotation pca) :cols 0))\n  (def pc2 (sel (:rotation pca) :cols 1))\n\n  ;; project the first four dimension of the iris data onto the first\n  ;; two principal components\n  (def x1 (mmult (sel iris :cols (range 4)) pc1))\n  (def x2 (mmult (sel iris :cols (range 4)) pc2))\n\n  ;; now plot the transformed data, coloring each species a different color\n  (def plot (scatter-plot x1 x2\n                          :group-by (sel iris :cols 4)\n                          :x-label \"PC1\" :y-label \"PC2\" :title \"Iris PCA\"))\n\n  (view plot)\n  ;; put box around the first group\n  (add-polygon plot [[-3.2 -6.3] [-2 -6.3] [-2 -3.78] [-3.2 -3.78]])\n  ;; add some text annotations\n  (add-text plot -2.5 -6.5 \"Setosa\")\n  (add-text plot -5 -5.5 \"Versicolor\")\n  (add-text plot -8 -5.5 \"Virginica\")",
   :name "add-polygon"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1519",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/add-text",
   :namespace "incanter.charts",
   :line 1519,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart x y text & options]),
   :doc
   " Adds a text annotation centered at the given coordinates.\n\nArguments:\n  chart -- the chart to annotate\n  x, y -- the coordinates to center the text\n  text -- the text to add\n\n\nExamples:\n\n  ;; PCA chart example\n  (use '(incanter core stats charts datasets))\n  ;; load the iris dataset\n  (def iris (to-matrix (get-dataset :iris)))\n  ;; run the pca\n  (def pca (principal-components (sel iris :cols (range 4))))\n  ;; extract the first two principal components\n  (def pc1 (sel (:rotation pca) :cols 0))\n  (def pc2 (sel (:rotation pca) :cols 1))\n\n  ;; project the first four dimension of the iris data onto the first\n  ;; two principal components\n  (def x1 (mmult (sel iris :cols (range 4)) pc1))\n  (def x2 (mmult (sel iris :cols (range 4)) pc2))\n\n  ;; now plot the transformed data, coloring each species a different color\n  (def plot (scatter-plot x1 x2\n                          :group-by (sel iris :cols 4)\n                          :x-label \"PC1\" :y-label \"PC2\" :title \"Iris PCA\"))\n  (view plot)\n  ;; add some text annotations\n  (add-text plot -2.5 -6.5 \"Setosa\")\n  (add-text plot -5 -5.5 \"Versicolor\")\n  (add-text plot -8 -5.5 \"Virginica\")",
   :name "add-text"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1155",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/bar-chart",
   :namespace "incanter.charts",
   :line 1155,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([categories values & options]),
   :doc
   "Returns a JFreeChart object representing a bar-chart of the given data.\n Use the 'view' function to display the chart, or the 'save' function\n to write it to a file.\n\n Arguments:\n   categories -- a sequence of categories\n   values -- a sequence of numeric values\n\n Options:\n   :title (default 'Histogram') main title\n   :x-label (default 'Categories')\n   :y-label (default 'Value')\n   :series-label\n   :legend (default false) prints legend\n   :vertical (default true) the orientation of the plot\n   :group-by (default nil) -- a vector of values used to group the values into\n                              series within each category.\n\n\n See also:\n   view and save\n\n Examples:\n\n\n   (use '(incanter core stats charts datasets))\n\n   (with-data (get-dataset :co2)\n     (view (bar-chart :Type :uptake\n                      :title \"CO2 Uptake\"\n                      :group-by :Treatment\n                      :x-label \"Grass Types\" :y-label \"Uptake\"\n                     :legend true)))\n\n\n   (def data (get-dataset :airline-passengers))\n   (view (bar-chart :year :passengers :group-by :month :legend true :data data))\n\n   (with-data  (get-dataset :airline-passengers)\n     (view (bar-chart :month :passengers :group-by :year :legend true)))\n\n\n   (def data (get-dataset :austres))\n   (view data)\n   (def plot (bar-chart :year :population :group-by :quarter :legend true :data data))\n   (view plot)\n   (save plot \"/tmp/austres_plot.png\" :width 1000)\n   (view \"file:///tmp/austres_plot.png\")\n\n\n   (def seasons (mapcat identity (repeat 3 [\"winter\" \"spring\" \"summer\" \"fall\"])))\n   (def years (mapcat identity (repeat 4 [2007 2008 2009])))\n   (def values (sample-uniform 12 :integers true :max 100))\n   (view (bar-chart years values :group-by seasons :legend true))\n\n   (view (bar-chart [\"a\" \"b\" \"c\"] [10 20 30]))\n   (view (bar-chart [\"a\" \"a\" \"b\" \"b\" \"c\" \"c\" ] [10 20 30 10 40 20]\n                    :legend true\n                    :group-by [\"I\" \"II\" \"I\" \"II\" \"I\" \"II\"]))\n\n   ;; add a series label\n   (def plot (bar-chart [\"a\" \"b\" \"c\"] [10 20 30] :legend true :series-label \"s1\"))\n   (view plot) \n   (add-categories plot [\"a\" \"b\" \"c\"] [5 25 40] :series-label \"s2\")  \n\n   (view (bar-chart (sample \"abcdefghij\" :size 10 :replacement true)\n                    (sample-uniform 10 :max 50) :legend true))\n\n\n\n References:\n   http://www.jfree.org/jfreechart/api/javadoc/\n   http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "bar-chart"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1713",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/bland-altman-plot",
   :namespace "incanter.charts",
   :line 1713,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([x1 x2 & options]),
   :doc
   "\n\nExamples:\n\n  (use '(incanter core datasets charts))\n  (def flow-meter (to-matrix (get-dataset :flow-meter)))\n  (def x1 (sel flow-meter :cols 1))\n  (def x2 (sel flow-meter :cols 3))\n  (view (bland-altman-plot x1 x2))\n\n  (with-data (get-dataset :flow-meter)\n    (view (bland-altman-plot \"Wright 1st PEFR\" \"Mini Wright 1st PEFR\")))\n\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Bland-Altman_plot\n  http://www-users.york.ac.uk/~mb55/meas/ba.htm",
   :name "bland-altman-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1298",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/box-plot",
   :namespace "incanter.charts",
   :line 1298,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([x & options]),
   :doc
   " Returns a JFreeChart object representing a box-plot of the given data.\nUse the 'view' function to display the chart, or the 'save' function\nto write it to a file.\n\nOptions:\n  :title (default 'Histogram') main title\n  :x-label (default x expression)\n  :y-label (default 'Frequency')\n  :legend (default false) prints legend\n  :series-label (default x expression)\n  :group-by (default nil) -- a vector of values used to group the x values into series.\n\nSee also:\n  view and save\n\nExamples:\n\n  (use '(incanter core stats charts))\n  (def gamma-box-plot (box-plot (sample-gamma 1000 :shape 1 :rate 2)\n                        :title \"Gamma Boxplot\"\n                        :legend true))\n  (view gamma-box-plot)\n  (add-box-plot gamma-box-plot (sample-gamma 1000 :shape 2 :rate 2))\n  (add-box-plot gamma-box-plot (sample-gamma 1000 :shape 3 :rate 2))\n\n  ;; use the group-by options\n  (use '(incanter core stats datasets charts))\n  (with-data (get-dataset :iris)\n    (view (box-plot :Petal.Length :group-by :Species :legend true))\n    (view (box-plot :Petal.Width :group-by :Species :legend true))\n    (view (box-plot :Sepal.Length :group-by :Species :legend true))\n    (view (box-plot :Sepal.Width :group-by :Species :legend true)))\n\n  ;; see INCANTER_HOME/examples/probability_plots.clj for more examples of plots\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "box-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L558",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/clear-background",
   :namespace "incanter.charts",
   :line 558,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart]),
   :doc
   " Sets the alpha level (transparancy) of the plot's background to zero\nremoving the default grid, returns the modified chart object.\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "clear-background"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1380",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/function-plot",
   :namespace "incanter.charts",
   :line 1380,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([function min-range max-range & options]),
   :doc
   " Returns a xy-plot object of the given function over the range indicated\nby the min-range and max-range arguments. Use the 'view' function to\ndisplay the chart, or the 'save' function to write it to a file.\n\nOptions:\n  :title (default 'Histogram') main title\n  :x-label (default x expression)\n  :y-label (default 'Frequency')\n  :legend (default false) prints legend\n  :series-label (default x expression)\n  :step-size (default (/ (- max-range min-range) 500))\n\nSee also:\n  view, save, add-points, add-lines\n\n\nExamples:\n\n  (use '(incanter core stats charts))\n\n  (view (function-plot sin (- Math/PI) Math/PI))\n  (view (function-plot pdf-normal -3 3))\n\n  (defn cubic [x] (+ (* x x x) (* 2 x x) (* 2 x) 3))\n  (view (function-plot cubic -10 10))",
   :name "function-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L904",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/histogram",
   :namespace "incanter.charts",
   :line 904,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([x & options]),
   :doc
   " Returns a JFreeChart object representing the histogram of the given data.\nUse the 'view' function to display the chart, or the 'save' function\nto write it to a file.\n\nOptions:\n  :nbins (default 10) number of bins\n  :density (default false) if false, plots frequency, otherwise density\n  :title (default 'Histogram') main title\n  :x-label (default x expression)\n  :y-label (default 'Frequency')\n  :legend (default false) prints legend\n  :series-label (default x expression)\n\n\nSee also:\n  view, save, add-histogram\n\nExamples:\n\n  (use '(incanter core charts stats))\n  (view (histogram (sample-normal 1000)))\n\n  # plot a density histogram\n  (def hist (histogram (sample-normal 1000) :density true))\n  (view hist)\n\n  # add a normal density line to the plot\n  (def x (range -4 4 0.01))\n  (add-lines hist x (pdf-normal x))\n\n  # plot some gamma data\n  (def gam-hist (histogram (sample-gamma 1000) :density true :nbins 30))\n  (view gam-hist)\n  (def x (range 0 8 0.01))\n  (add-lines gam-hist x (pdf-gamma x))\n\n  (use 'incanter.datasets)\n  (def iris (get-dataset :iris))\n  (view (histogram :Sepal.Width :data iris))\n\n  (with-data (get-dataset :iris)\n    (view (histogram :Petal.Length)))\n\n\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "histogram"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1013",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/line-chart",
   :namespace "incanter.charts",
   :line 1013,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([categories values & options]),
   :doc
   "Returns a JFreeChart object representing a line-chart of the given values and categories.\n Use the 'view' function to display the chart, or the 'save' function\n to write it to a file.\n\n Arguments:\n   categories -- a sequence of categories\n   values -- a sequence of numeric values\n\n Options:\n   :title (default 'Histogram') main title\n   :x-label (default 'Categories')\n   :y-label (default 'Value')\n   :legend (default false) prints legend\n   :series-label\n   :group-by (default nil) -- a vector of values used to group the values into\n                              series within each category.\n\n\n See also:\n   view and save\n\n Examples:\n\n   (use '(incanter core stats charts datasets))\n\n   (def data (get-dataset :airline-passengers))\n   (def years (sel data :cols 0))\n   (def months (sel data :cols 2))\n   (def passengers (sel data :cols 1))\n   (view (line-chart years passengers :group-by months :legend true))\n   (view (line-chart months passengers :group-by years :legend true))\n\n\n   (def seasons (mapcat identity (repeat 3 [\"winter\" \"spring\" \"summer\" \"fall\"])))\n   (def years (mapcat identity (repeat 4 [2007 2008 2009])))\n   (def x (sample-uniform 12 :integers true :max 100))\n   (view (line-chart years x :group-by seasons :legend true))\n\n   (view (line-chart [\"a\" \"b\" \"c\" \"d\" \"e\" \"f\"] [10 20 30 10 40 20]))\n\n   (view (line-chart (sample \"abcdefghij\" :size 10 :replacement true)\n                        (sample-uniform 10 :max 50) :legend true))\n\n   ;; add a series label\n   (def plot (line-chart [\"a\" \"b\" \"c\"] [10 20 30] :legend true :series-label \"s1\"))\n   (view plot) \n   (add-categories plot [\"a\" \"b\" \"c\"] [5 25 40] :series-label \"s2\")  \n\n\n   (view (line-chart :year :passengers :group-by :month :legend true :data data)) \n   \n   (view (line-chart :month :passengers :group-by :year :legend true :data data))\n   \n   (with-data data\n     (view (line-chart :month :passengers :group-by :year :legend true)))\n\n   (with-data (->> ($rollup :sum :passengers :year (get-dataset :airline-passengers))\n                   ($order :year :asc))\n     (view (line-chart :year :passengers)))\n\n   (with-data (->> ($rollup :sum :passengers :month (get-dataset :airline-passengers))\n                   ($order :passengers :asc))\n     (view (line-chart :month :passengers)))\n\n\n   (with-data ($rollup :sum :passengers :month (get-dataset :airline-passengers))\n     (view (line-chart :month :passengers)))\n\n\n\n References:\n   http://www.jfree.org/jfreechart/api/javadoc/\n   http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "line-chart"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1674",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/qq-plot",
   :namespace "incanter.charts",
   :line 1674,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   "\nReturns a QQ-Plot object. Use the 'view' function to display it.\n\nReferences:\n  http://en.wikipedia.org/wiki/QQ_plot\n\nExamples:\n\n  (use '(incanter core stats charts datasets))\n  (view (qq-plot (sample-normal 100)))\n  (view (qq-plot (sample-exp 100)))\n  (view (qq-plot (sample-gamma 100)))\n\n  (with-data (get-dataset :iris)\n    (view (qq-plot :Sepal.Length)))",
   :name "qq-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L799",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/scatter-plot",
   :namespace "incanter.charts",
   :line 799,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([x y & options]),
   :doc
   " Returns a JFreeChart object representing a scatter-plot of the given data.\nUse the 'view' function to display the chart, or the 'save' function\nto write it to a file.\n\nOptions:\n  :title (default 'Histogram') main title\n  :x-label (default x expression)\n  :y-label (default 'Frequency')\n  :legend (default false) prints legend\n  :series-label (default x expression)\n  :group-by (default nil) -- a vector of values used to group the x and y values into series.\n\nSee also:\n  view, save, add-points, add-lines\n\nExamples:\n\n  (use '(incanter core stats charts datasets))\n  ;; create some data\n  (def mvn-samp (sample-mvn 1000 :mean [7 5] :sigma (matrix [[2 1.5] [1.5 3]])))\n\n  ;; create scatter-plot of points\n  (def mvn-plot (scatter-plot (sel mvn-samp :cols 0) (sel mvn-samp :cols 1)))\n  (view mvn-plot)\n\n  ;; add regression line to scatter plot\n  (def x (sel mvn-samp :cols 0))\n  (def y (sel mvn-samp :cols 1))\n  (def lm (linear-model y x))\n  (add-lines mvn-plot x (:fitted lm))\n\n  ;; use :group-by option\n  (use '(incanter core stats datasets charts))\n  ;; load the :iris dataset\n  (def iris (get-dataset :iris))\n  ;; plot the first two columns grouped by the fifth column\n  (view (scatter-plot ($ :Sepal.Width iris) ($ :Sepal.Length iris) :group-by ($ :Species iris)))\n\n  (view (scatter-plot :Sepal.Length :Sepal.Width :data (get-dataset :iris)))\n\n  (view (scatter-plot :Sepal.Length :Sepal.Width :group-by :Species :data (get-dataset :iris)))\n\n  (with-data (get-dataset :iris)\n     (view (scatter-plot :Sepal.Length :Sepal.Width)))\n\n  (with-data (get-dataset :iris)\n     (view (scatter-plot :Sepal.Length :Sepal.Width :group-by :Species)))\n\n\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "scatter-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L530",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/set-alpha",
   :namespace "incanter.charts",
   :line 530,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart alpha]),
   :doc
   " Sets the alpha level (transparancy) of the plot's foreground\nreturns the modified chart object.\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "set-alpha"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L544",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/set-background-alpha",
   :namespace "incanter.charts",
   :line 544,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart alpha]),
   :doc
   " Sets the alpha level (transparancy) of the plot's background\nreturns the modified chart object.\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "set-background-alpha"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L58",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/set-theme",
   :namespace "incanter.charts",
   :line 58,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart theme]),
   :doc
   "  Changes the chart theme.\n\nArguments:\n  chart -- an Incanter/JFreeChart object\n  theme -- either a keyword indicating one of the built-in themes, or a JFreeChart ChartTheme object.\n\nBuilt-in Themes:\n  :default\n  :dark\n\nExamples:\n\n  (use '(incanter core charts))\n  (def chart (function-plot sin -4 4))\n  (view chart)\n  ;; change the theme of chart to :dark\n  (set-theme chart :dark)\n  ;; change it back to the default\n  (set-theme chart :default)\n\n\n References:\n    http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/StandardChartTheme.html\n    http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/ChartTheme.html ",
   :name "set-theme"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L573",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/set-title",
   :namespace "incanter.charts",
   :line 573,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart title]),
   :doc
   " Sets the main title of the plot, returns the modified chart object.\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "set-title"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L586",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/set-x-label",
   :namespace "incanter.charts",
   :line 586,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart label]),
   :doc
   " Sets the label of the x-axis, returns the modified chart object.\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "set-x-label"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L599",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/set-y-label",
   :namespace "incanter.charts",
   :line 599,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([chart label]),
   :doc
   " Sets the label of the y-axis, returns the modified chart object.\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "set-y-label"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L1633",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/trace-plot",
   :namespace "incanter.charts",
   :line 1633,
   :file "incanter/charts.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns a trace-plot object, use the 'view' function to display it.\n\nExamples:\n  (use '(incanter core datasets stats bayes charts))\n  (def ols-data (to-matrix (get-dataset :survey)))\n  (def x (sel ols-data (range 0 2313) (range 1 10)))\n  (def y (sel ols-data (range 0 2313) 10))\n  (def sample-params (sample-model-params 5000 (linear-model y x :intercept false)))\n  (view (trace-plot (:var sample-params)))\n\n  (view (trace-plot (sel (:coefs sample-params) :cols 0)))",
   :name "trace-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/charts.clj#L672",
   :wiki-url
   "http://liebke.github.com/incanter//charts-api.html#incanter.charts/xy-plot",
   :namespace "incanter.charts",
   :line 672,
   :file "incanter/charts.clj",
   :var-type "macro",
   :arglists ([x y & options]),
   :doc
   " Returns a JFreeChart object representing a xy-plot of the given data.\nUse the 'view' function to display the chart, or the 'save' function\nto write it to a file.\n\nOptions:\n  :data (default nil) If the :data option is provided a dataset, \n                      column names can be used instead of sequences \n                      of data as arguments to xy-plot.\n  :title (default 'Histogram') main title\n  :x-label (default x expression)\n  :y-label (default 'Frequency')\n  :legend (default false) prints legend\n  :series-label (default x expression)\n  :group-by (default nil) -- a vector of values used to group the x and y values into series.\n\nSee also:\n  view, save, add-points, add-lines\n\nExamples:\n\n  (use '(incanter core stats charts))\n\n  ;; plot the cosine function\n  (def x (range -1 5 0.01))\n  (def y (cos (mult 2 Math/PI x)))\n  (view (xy-plot x y))\n\n  ;; plot gamma pdf with different parameters\n  (def x2 (range 0 20 0.1))\n  (def gamma-plot (xy-plot x2 (pdf-gamma x2 :shape 1 :rate 2)\n                             :legend true\n                             :title \"Gamma PDF\"\n                             :y-label \"Density\"))\n  (view gamma-plot)\n  (add-lines gamma-plot x2 (pdf-gamma x2 :shape 2 :rate 2))\n  (add-lines gamma-plot x2 (pdf-gamma x2 :shape 3 :rate 2))\n  (add-lines gamma-plot x2 (pdf-gamma x2 :shape 5 :rate 1))\n  (add-lines gamma-plot x2 (pdf-gamma x2 :shape 9 :rate 0.5))\n\n  ;; use :group-by option\n  (use '(incanter core charts datasets))\n\n  (with-data (get-dataset :chick-weight)\n    (view (xy-plot :Time :weight :group-by :Chick)))\n\n\n  ;; see INCANTER_HOME/examples/probability_plots.clj for more examples of plots\n\nReferences:\n  http://www.jfree.org/jfreechart/api/javadoc/\n  http://www.jfree.org/jfreechart/api/javadoc/org/jfree/chart/JFreeChart.html",
   :name "xy-plot"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L256",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/are-overlapping?",
   :namespace "incanter.chrono",
   :line 256,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([[s e] [s1 e1]]),
   :doc "",
   :name "are-overlapping?"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L244",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/before?",
   :namespace "incanter.chrono",
   :line 244,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([start end]),
   :doc "",
   :name "before?"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L346",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/beginning-of",
   :namespace "incanter.chrono",
   :line 346,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([the-date unit]),
   :doc
   "Return a date at the beginning of the month, year, day, etc. from the-date.",
   :name "beginning-of"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L135",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/date",
   :namespace "incanter.chrono",
   :line 135,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Returns a new date object. Takes year, month, and day as args as\nwell as optionally hours, minutes, and seconds.",
   :name "date"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L360",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/date-seq",
   :namespace "incanter.chrono",
   :line 360,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([units from to] [units from]),
   :doc
   "Returns a lazy seq of dates starting with from up until to in\nincrements of units. If to is omitted, returns an infinite seq.",
   :name "date-seq"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L303",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/date-time",
   :namespace "incanter.chrono",
   :line 303,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d t]),
   :doc "",
   :name "date-time"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L158",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/date>",
   :namespace "incanter.chrono",
   :line 158,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d]),
   :doc "",
   :name "date>"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L371",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/def-date-format",
   :namespace "incanter.chrono",
   :line 371,
   :file "incanter/chrono.clj",
   :var-type "macro",
   :arglists ([fname [arg] & body]),
   :doc "",
   :name "def-date-format"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L377",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/def-date-parser",
   :namespace "incanter.chrono",
   :line 377,
   :file "incanter/chrono.clj",
   :var-type "macro",
   :arglists ([fname [arg] & body]),
   :doc "",
   :name "def-date-parser"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L307",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/earlier",
   :namespace "incanter.chrono",
   :line 307,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([the-date amount units] [the-date units]),
   :doc
   "Returns a date that is earlier than the-date by amount units.\nAmount is one if not specified.",
   :name "earlier"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L320",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/earlier?",
   :namespace "incanter.chrono",
   :line 320,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([date-a date-b]),
   :doc "Is date-a earlier than date-b?",
   :name "earlier?"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L354",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/end-of",
   :namespace "incanter.chrono",
   :line 354,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([the-date unit]),
   :doc
   "Return a date at the end of the month, year, day, etc. from the-date.",
   :name "end-of"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L125",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/format-date",
   :namespace "incanter.chrono",
   :line 125,
   :file "incanter/chrono.clj",
   :var-type "multimethod",
   :doc
   "Take in a date and a format (either a keyword or a string) and\nreturn a string with the formatted date.",
   :name "format-date"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L240",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/hours-around",
   :namespace "incanter.chrono",
   :line 240,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([r d]),
   :doc "",
   :name "hours-around"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L225",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/hours-between",
   :namespace "incanter.chrono",
   :line 225,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([start end]),
   :doc "",
   :name "hours-between"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L232",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/hours-from",
   :namespace "incanter.chrono",
   :line 232,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d h]),
   :doc "",
   :name "hours-from"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L252",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/is-within?",
   :namespace "incanter.chrono",
   :line 252,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d [s e]]),
   :doc "",
   :name "is-within?"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L171",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/joda-date",
   :namespace "incanter.chrono",
   :line 171,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([str-d] [y m d h min sec mill zone]),
   :doc "",
   :name "joda-date"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L213",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/joda-guard",
   :namespace "incanter.chrono",
   :line 213,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d]),
   :doc "",
   :name "joda-guard"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L177",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/joda-proxy",
   :namespace "incanter.chrono",
   :line 177,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc "joda-date object wraped in a proxy of goodness.",
   :name "joda-proxy"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L207",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/joda-str",
   :namespace "incanter.chrono",
   :line 207,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d]),
   :doc "",
   :name "joda-str"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L291",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/later",
   :namespace "incanter.chrono",
   :line 291,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([the-date amount units] [the-date units]),
   :doc
   "Returns a date that is later than the-date by amount units.\nAmount is one if not specified.",
   :name "later"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L315",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/later?",
   :namespace "incanter.chrono",
   :line 315,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([date-a date-b]),
   :doc "Is date-a later than date-b?",
   :name "later?"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L218",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/minutes-between",
   :namespace "incanter.chrono",
   :line 218,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([start end]),
   :doc "",
   :name "minutes-between"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L236",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/minutes-from",
   :namespace "incanter.chrono",
   :line 236,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([d m]),
   :doc "",
   :name "minutes-from"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L277",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/now",
   :namespace "incanter.chrono",
   :line 277,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Returns a new date object with the current date and time.",
   :name "now"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L130",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/parse-date",
   :namespace "incanter.chrono",
   :line 130,
   :file "incanter/chrono.clj",
   :var-type "multimethod",
   :doc
   "Take in a string with a formatted date and a format (either a\nkeyword or a string) and return a parsed date.",
   :name "parse-date"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L324",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/time-between",
   :namespace "incanter.chrono",
   :line 324,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([date-a date-b] [date-a date-b units]),
   :doc
   "How many units between date-a and date-b? Units defaults to seconds.",
   :name "time-between"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L167",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/time-zone",
   :namespace "incanter.chrono",
   :line 167,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([offset]),
   :doc "",
   :name "time-zone"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L282",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/today",
   :namespace "incanter.chrono",
   :line 282,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "Returns a new date object with only the current date. The time\nfields will be set to 0.",
   :name "today"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L94",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/units-in-seconds",
   :namespace "incanter.chrono",
   :line 94,
   :file "incanter/chrono.clj",
   :var-type "var",
   :doc "Number of seconds in each unit",
   :name "units-in-seconds"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L84",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/units-to-calendar-units",
   :namespace "incanter.chrono",
   :line 84,
   :file "incanter/chrono.clj",
   :var-type "var",
   :doc "Conversion of unit keywords to Calendar units",
   :name "units-to-calendar-units"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/chrono.clj#L248",
   :wiki-url
   "http://liebke.github.com/incanter//chrono-api.html#incanter.chrono/valid-range?",
   :namespace "incanter.chrono",
   :line 248,
   :file "incanter/chrono.clj",
   :var-type "function",
   :arglists ([[start end]]),
   :doc "",
   :name "valid-range?"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L28",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/categorical-classifiers",
   :namespace "incanter.classification",
   :line 28,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([features]),
   :doc "makes a categorical classifier for use with |each.",
   :name "categorical-classifiers"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L35",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/category-classifier",
   :namespace "incanter.classification",
   :line 35,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "",
   :name "category-classifier"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L40",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/category-map-classifier",
   :namespace "incanter.classification",
   :line 40,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([x] [s x]),
   :doc "",
   :name "category-map-classifier"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L106",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/classification-workflow",
   :namespace "incanter.classification",
   :line 106,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([transformer classifier count-all]),
   :doc
   "\ncomposes a classification workflow from a classifier a counter and a transformer.\n\nnote that count-all has been abstracted due to the fact taht you may count with reduce or merge-with depending on wheter you ahve vectors or maps.",
   :name "classification-workflow"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L15",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/classifier",
   :namespace "incanter.classification",
   :line 15,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([fns classify]),
   :doc "",
   :name "classifier"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L83",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/classify-one-to-all",
   :namespace "incanter.classification",
   :line 83,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([fns data]),
   :doc
   "\ntakes a map of fns and a map of features, apply each classifer fn to the entire feature map.\n\nusage:\n\n (classify-one-to-each  \n   {:a (present-when #(and \n\t\t\t\t     (> (:a %) 9)\n\t\t\t\t     (< (:b %) 6)))}\n   {:a 10 :b 5})\n-> {:a 1}",
   :name "classify-one-to-all"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L68",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/classify-one-to-each",
   :namespace "incanter.classification",
   :line 68,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([fns data]),
   :doc
   "\ntakes a map of fns and a map of features, apply each classifer fn to each feature in the data map individually.\n\nusage:\n\n (classify-one-to-each  \n   {:a (present-when (gt 5)) :b (present-when (lt 5))}\n   {:a 10 :b 5})\n-> {:a {:a 1 :b 0} :b {:a 0 :b 0}}",
   :name "classify-one-to-each"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L53",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/classify-one-to-one",
   :namespace "incanter.classification",
   :line 53,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([fns data]),
   :doc
   "\ntakes a map of fns and a map of features, where there is one classifier fn per feature and they share the same key names in the classifier and feature maps.  apply each classifer fn to the corresponding feature.\n\nusage:\n\n (classify-one-to-one  \n   {:a (present-when (gt 5)) :b (present-when (lt 5))}\n   {:a 10 :b 5})\n-> {:a 1 :b 0}",
   :name "classify-one-to-one"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L300",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/collect-vals",
   :namespace "incanter.classification",
   :line 300,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([maps]),
   :doc "",
   :name "collect-vals"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L213",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/confusion-matrix",
   :namespace "incanter.classification",
   :line 213,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([trd tst]),
   :doc
   "computes a confusion matrix from the counts on train and test data sets represented as maps. traverse map...as you get to the point of counts of actuals, replace the series of nested keys that lead to that point with the single key of the predicted",
   :name "confusion-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L314",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/confusion-matrix-by-time",
   :namespace "incanter.classification",
   :line 314,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([results]),
   :doc "",
   :name "confusion-matrix-by-time"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L257",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/confusion-matrix-from-counts",
   :namespace "incanter.classification",
   :line 257,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([test & train]),
   :doc
   "\nproduces a confusion matrix from teh joint distributions of test and train data.\n\nright now the tests and train data are con-prob-tuples this may change if we store only the joint PMFs",
   :name "confusion-matrix-from-counts"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L269",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/cross-validation-confusion-matrix",
   :namespace "incanter.classification",
   :line 269,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([& xs]),
   :doc
   "\ntakes a set of n joint PMFs, and holds each joint PMF out in turn as the test set.  \n\nmerges the resulting n cross-validation matrices into a single matrix.",
   :name "cross-validation-confusion-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L126",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/equivalence-classes",
   :namespace "incanter.classification",
   :line 126,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([class-mappings]),
   :doc
   "\ntakes a map where key is class and value is a set of equivalence classes to the key class.  it then inverts the mapping so that you can look up classes that are equivalence classes of a new larger class.\n\nusage:\n (equivalence-classes {0 #{0 1}, 1 #{2, 3, 4}, 2 #{5 6}})\n-> {0 0, 1 0, 2 1, 3 1, 4 1, 5 2, 6 2}",
   :name "equivalence-classes"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L115",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/heterogenious-group-by",
   :namespace "incanter.classification",
   :line 115,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([f coll]),
   :doc
   "Returns a sorted map of the elements of coll keyed by the result of\nf on each element. The value at each key will be a vector of the\ncorresponding elements, in the order they appeared in coll.",
   :name "heterogenious-group-by"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L289",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/map-of-vectors",
   :namespace "incanter.classification",
   :line 289,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([keys]),
   :doc "",
   :name "map-of-vectors"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L150",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/merge-equivalence-classes",
   :namespace "incanter.classification",
   :line 150,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([class-mappings x]),
   :doc
   "\n (defn merge-classes-time-before-dep [model]\n  \"take in [[{modelcounts} {totalcounts}] [{} {}]]\"\n  ;;starting with 2 becasue 1 is the first slot, which is time before departure for the metrics\n  (let [model-merger {2 bucket-eq-classes\n\t\t      3 bucket-eq-classes\n\t\t      6 bucket-eq-classes}\n\tcount-merger {2 bucket-eq-classes\n\t\t      3 bucket-eq-classes}]\n  (map (fn [[modelcnts totalcnts]] [(merge-equivalence-classes model-merger modelcnts) \n\t\t\t\t    (merge-equivalence-classes count-merger totalcnts)]) model)))",
   :name "merge-equivalence-classes"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L138",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/merge-levels",
   :namespace "incanter.classification",
   :line 138,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([class-mappings coll]),
   :doc "",
   :name "merge-levels"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L193",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/model-from-maps",
   :namespace "incanter.classification",
   :line 193,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([prob-map]),
   :doc "creates a model from probability report maps.",
   :name "model-from-maps"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L198",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/most-likely",
   :namespace "incanter.classification",
   :line 198,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "\ncomputes the most likely class from a map of classes to class probability.\n\nusage:\n (most-likely {:a 0.6 :b 0.4}) -> :a",
   :name "most-likely"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L282",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/n-times-k-fold-cross-validation-confusion-matrix",
   :namespace "incanter.classification",
   :line 282,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([list-of-lists]),
   :doc "",
   :name "n-times-k-fold-cross-validation-confusion-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L21",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/numerical-classifiers",
   :namespace "incanter.classification",
   :line 21,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([ranges]),
   :doc
   "makes a bucketing classifier out of each range for use with |each.",
   :name "numerical-classifiers"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L231",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/precision",
   :namespace "incanter.classification",
   :line 231,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([m]),
   :doc "computes precision by class label from confusion matrix.",
   :name "precision"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L307",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/prob-map-tuples-by-time",
   :namespace "incanter.classification",
   :line 307,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([prob-map-tuple]),
   :doc
   "use to transform data for confusion matrix by time before departure",
   :name "prob-map-tuples-by-time"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L174",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/probs-only",
   :namespace "incanter.classification",
   :line 174,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([k a b] [a b]),
   :doc
   "compute probability from computed counts.  \n\nthis is division, you have to count up the proper numerator and denominator in your counting step.",
   :name "probs-only"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L181",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/process-prob-map",
   :namespace "incanter.classification",
   :line 181,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([[a-and-b b] report]),
   :doc
   "process probability maps using a provided report function. \n\nbeware: can't pass keys to reporter our you get double nested final level in map.",
   :name "process-prob-map"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L241",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/recall",
   :namespace "incanter.classification",
   :line 241,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([m]),
   :doc "computes recall by class label from confusion matrix.",
   :name "recall"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L295",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/vectorize",
   :namespace "incanter.classification",
   :line 295,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([maps]),
   :doc "",
   :name "vectorize"}
  {:source-url
   "http://github.com/liebke/incanter/blob//modules/incanter/classification.clj#L46",
   :wiki-url
   "http://liebke.github.com/incanter//classification-api.html#incanter.classification/wrapper-classifiers",
   :namespace "incanter.classification",
   :line 46,
   :file "incanter/classification.clj",
   :var-type "function",
   :arglists ([features]),
   :doc
   "makes a wrapping classifier like categortical but with wrapper fn.",
   :name "wrapper-classifiers"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1487",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$",
   :namespace "incanter.core",
   :line 1487,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([cols] [cols data] [rows cols data]),
   :doc
   "An alias to (sel (second args) :cols (first args)). If given only a single argument,\nit will use the $data binding for the first argument, which is set with\nthe with-data macro.\n\nExamples:\n  (use '(incanter core stats charts datasets))\n\n  (def cars (get-dataset :cars))\n  ($ :speed cars)\n\n  \n  (with-data cars\n    (def lm (linear-model ($ :dist) ($ :speed)))\n    (doto (scatter-plot ($ :speed) ($ :dist))\n      view\n      (add-lines ($ :speed) (:fitted lm))))\n\n  ;; standardize speed and dist and append the standardized variables to the original dataset\n  (with-data (get-dataset :cars)\n    (view (conj-cols $data \n                     (sweep (sweep ($ :speed)) :stat sd :fun div)\n                     (sweep (sweep ($ :dist)) :stat sd :fun div))))\n\n  (with-data (get-dataset :iris)\n    (view $data)\n    (view ($ [:Sepal.Length :Sepal.Width :Species]))\n    (view ($ [:not :Petal.Width :Petal.Length]))\n    (view ($ 0 [:not :Petal.Width :Petal.Length])))\n\n\n   (use 'incanter.core)\n   (def mat (matrix (range 9) 3))\n   (view mat)\n   ($ 2 2 mat)\n   ($ [0 2] 2 mat)\n   ($ :all 1 mat)\n   ($ 1 mat)\n   ($ [:not 1] mat)\n   ($ 0 :all mat)\n   ($ [0 2] [0 2] mat)\n   ($ [:not 1] [:not 1] mat)\n   ($ [:not 1] :all mat)\n   ($ [0 2] [:not 1] mat)\n   ($ [0 2] [:not 1 2] mat)\n   ($ [0 2] [:not (range 2)] mat)\n   ($ [:not (range 2)] [0 2] mat)\n\n   (with-data mat \n     ($ 0 0))\n   (with-data mat \n     ($ [0 2] 2 mat))\n   (with-data mat \n     ($ :all 1))\n   (with-data mat \n     ($ [0 2] [0 2]))\n   (with-data mat \n     ($ [:not 1] :all))\n   (with-data mat \n     ($ [0 2] [:not 1]))\n\n\n   (use 'incanter.datasets)\n   (view (get-dataset :cars))\n   ($ (range 5) 0 (get-dataset :cars))\n   ($ (range 5) :all (get-dataset :cars))\n   ($ :all (range 2) (get-dataset :cars))\n\n   ($ (range 5) :dist (get-dataset :cars))\n   ($ [:not (range 5)] 0 (get-dataset :cars))\n   ($ [:not 0 1 2 3 4] 0 (get-dataset :cars))\n   (with-data (get-dataset :cars)\n     ($ 0 :dist))\n\n   (with-data (get-dataset :hair-eye-color)\n     (view $data)\n     (view ($ [:not :gender])))",
   :name "$"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L53",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$data",
   :namespace "incanter.core",
   :line 53,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "var",
   :doc
   "This variable is bound to a dataset when the with-data macro is used.\nfunctions like $ and $where can use $data as a default argument.",
   :name "$data"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1743",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$group-by",
   :namespace "incanter.core",
   :line 1743,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([cols] [cols data]),
   :doc
   "Returns a map of datasets keyed by a query-map corresponding the group.\n\nExamples:\n\n  (use '(incanter core datasets))\n  ($group-by :Species (get-dataset :iris))\n\n  ($group-by [:hair :eye] (get-dataset :hair-eye-color))\n\n  (with-data (get-dataset :hair-eye-color)\n    ($group-by [:hair :eye]))",
   :name "$group-by"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1814",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$join",
   :namespace "incanter.core",
   :line 1814,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists
   ([[left-keys right-keys] left-data]
    [[left-keys right-keys] left-data right-data]),
   :doc
   " \nReturns a dataset created by right-joining two datasets.\nThe join is based on one or more columns in the datasets. \nIf used within the body of the with-data macro, the second\ndataset is optional, defaulting the the dataset bound to $data.\n\n\nExamples:\n  (use '(incanter core stats datasets charts))\n  (def iris (get-dataset :iris))\n\n\n\n  (def lookup (dataset [:species :species-key] [[\"setosa\" :setosa] \n                                                [\"versicolor\" :versicolor] \n                                                [\"virginica\" :virginica]]))\n  (view ($join [:species :Species] lookup iris))\n \n (def hair-eye-color (get-dataset :hair-eye-color))\n (def lookup2 (conj-cols ($ [:hair :eye :gender] hair-eye-color) (range (nrow hair-eye-color))))\n (view ($join [[:col-0 :col-1 :col-2] [:hair :eye :gender]] lookup2 hair-eye-color))\n\n (with-data hair-eye-color\n   (view ($join [[:col-0 :col-1 :col-2] [:hair :eye :gender]] lookup2)))\n\n\n (def lookup3 (dataset [:gender :hair :hair-gender] [[\"male\" \"black\" :male-black]\n                                                     [\"male\" \"brown\" :male-brown]\n                                                     [\"male\" \"red\" :male-red]\n                                                     [\"male\" \"blond\" :male-blond]\n                                                     [\"female\" \"black\" :female-black]\n                                                     [\"female\" \"brown\" :female-brown]\n                                                     [\"female\" \"red\" :female-red]\n                                                     [\"female\" \"blond\" :female-blond]]))\n\n (view ($join [[:gender :hair] [:gender :hair]] lookup3 hair-eye-color))\n\n (use 'incanter.charts)\n (with-data (->>  (get-dataset :hair-eye-color)\n                  ($where {:hair {:in #{\"brown\" \"blond\"}}})\n                  ($rollup :sum :count [:hair :gender])\n                  ($join [[:gender :hair] [:gender :hair]] lookup3)\n                  ($order :count :desc))\n     (view $data)\n     (view (bar-chart :hair :count :group-by :gender :legend true)))",
   :name "$join"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1775",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$map",
   :namespace "incanter.core",
   :line 1775,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([fun col-keys data] [fun col-keys]),
   :doc
   "This function returns a sequence resulting from mapping the given function over\n  the value(s) for the given column key(s) of the given dataset.\n  Like other '$*' functions, it will use $data as the default dataset\n  if none is provided, where $data is set using the with-data macro. \n\nExamples:\n\n  (use '(incanter core datasets))\n  (def cars (get-dataset :cars))\n\n  ($map \"speed\" (fn [s] (/ s)) cars)\n  ($map [\"speed\" \"dist\"] (fn [s d] (/ s d)) cars)\n\n  ($map (fn [s] (/ s)) :speed cars)\n  ($map (fn [s d] (/ s d)) [:speed :dist] cars)\n\n  (map (fn [s d] (/ s d)) ($ :speed cars) ($ :speed cars))\n\n  (with-data (get-dataset :cars)\n    (view ($map (fn [s] (/ s)) :speed))\n    (view ($map (fn [s d] (/ s d)) [:speed :dist])))\n\n  ;; calculate the speed to dist ratio and append as new column to dataset\n  (with-data (get-dataset :cars)\n    (conj-cols $data ($map (fn [s d] (/ s d)) [:speed :dist])))",
   :name "$map"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1715",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$order",
   :namespace "incanter.core",
   :line 1715,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([cols order] [cols order data]),
   :doc
   " Sorts a dataset by the given columns in either ascending (:asc)\n  or descending (:desc) order. If used within a the body of \n  the with-data macro, the data argument is optional, defaulting\n  to the dataset bound to the variable $data.\n\n  Examples:\n\n  (use '(incanter core charts datasets))\n  (def iris (get-datset :iris))\n  (view ($order :Sepal.Length :asc iris))\n  (view ($order [:Sepal.Width :Sepal.Length] :desc iris))\n\n  (with-data (get-dataset :iris)\n    (view ($order [:Petal.Length :Sepal.Length] :desc)))\n        \n",
   :name "$order"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1627",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$rollup",
   :namespace "incanter.core",
   :line 1627,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists
   ([summary-fun col-name group-by]
    [summary-fun col-name group-by data]),
   :doc
   "Returns a dataset that uses the given summary function (or function identifier keyword)\nto rollup the given column based on a set of group-by columns. The summary function\nshould accept a single sequence of values and return a single summary value. Alternatively,\nyou can provide a keyword identifer of a set of built-in functions including:\n  \n  :max -- the maximum value of the data in each group\n  :min -- the minimum value of the data in each group\n  :sum -- the sum of the data in each group\n  :count -- the number of elements in each group\n  :mean -- the mean of the data in each group\n  \n\n Like the other '$' dataset functions, $rollup will use the dataset bound to $data\n (see the with-data macro) if a dataset is not provided as an argument.\n\n Examples:\n\n   (use '(incanter core datasets))\n\n   (def iris (get-dataset :iris))\n   ($rollup :mean :Sepal.Length :Species iris)\n   ($rollup :count :Sepal.Length :Species iris)\n   ($rollup :max :Sepal.Length :Species iris)\n   ($rollup :min :Sepal.Length :Species iris)\n   \n   ;; The following is an example using a custom function, but since all the \n   ;; iris measurements are positive, the built-in mean function could have \n   ;; been used instead.\n\n   ($rollup #(mean (abs %)) :Sepal.Width :Species iris)\n\n   ($rollup sd :Sepal.Length :Species iris)\n   ($rollup variance :Sepal.Length :Species iris)\n   ($rollup median :Sepal.Length :Species iris)\n\n   (def hair-eye-color (get-dataset :hair-eye-color))\n   ($rollup :mean :count [:hair :eye] hair-eye-color)\n\n   (with-data ($rollup :mean :Sepal.Length :Species iris)\n     (view (bar-chart :Species :Sepal.Length)))\n\n    ;; the following exaples use the built-in data set called hair-eye-color.\n\n    (with-data ($rollup :mean :count [:hair :eye] hair-eye-color)\n      (view (bar-chart :hair :count :group-by :eye :legend true)))\n\n    (with-data (->>  (get-dataset :hair-eye-color)\n                     ($where {:hair {:in #{\"brown\" \"blond\"}}})\n                     ($rollup :sum :count [:hair :eye])\n                     ($order :count :desc))\n      (view $data)\n      (view (bar-chart :hair :count :group-by :eye :legend true)))",
   :name "$rollup"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1595",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/$where",
   :namespace "incanter.core",
   :line 1595,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([query-map] [query-map data]),
   :doc
   "An alias to (query-dataset (second args) (first args)). If given only a single argument,\nit will use the $data binding for the first argument, which is set with\nthe with-data macro.\n\nExamples:\n\n  (use '(incanter core datasets))\n\n  (def cars (get-dataset :cars))\n  ($where {:speed 10} cars)\n\n  ;; use the with-data macro and the one arg version of $where\n  (with-data cars\n    (view ($where {:speed {:$gt -10 :$lt 10}}))     \n    (view ($where {:dist {:$in #{10 12 16}}}))\n    (view ($where {:dist {:$nin #{10 12 16}}})))\n\n  ;; create a dataset where :speed greater than 10 or less than -10\n  (with-data (get-dataset :cars)\n    (view (-> ($where {:speed {:$gt 20}}) \n                    (conj-rows ($where {:speed {:$lt 10}})))))\n     ",
   :name "$where"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L542",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/abs",
   :namespace "incanter.core",
   :line 542,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the absolute value of the elements in the given matrix, sequence or number.\nEquivalent to R's abs function.",
   :name "abs"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L566",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/acos",
   :namespace "incanter.core",
   :line 566,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the arc cosine of the elements in the given matrix, sequence or number.\nEquivalent to R's acos function.",
   :name "acos"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L554",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/asin",
   :namespace "incanter.core",
   :line 554,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the arc sine of the elements in the given matrix, sequence or number.\nEquivalent to R's asin function.",
   :name "asin"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L578",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/atan",
   :namespace "incanter.core",
   :line 578,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the arc tangent of the elements in the given matrix, sequence or number.\nEquivalent to R's atan function.",
   :name "atan"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L499",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/atan2",
   :namespace "incanter.core",
   :line 499,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Returns the atan2 of the elements in the given matrices, sequences or numbers.\nEquivalent to R's atan2 function.",
   :name "atan2"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2144",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/beta",
   :namespace "incanter.core",
   :line 2144,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nEquivalent to R's beta function.\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/Gamma.html",
   :name "beta"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L364",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/bind-columns",
   :namespace "incanter.core",
   :line 364,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "   Returns the matrix resulting from concatenating the given matrices\nand/or sequences by their columns. Equivalent to R's cbind.\n\nExamples:\n  (def A (matrix [[1 2 3]\n                 [4 5 6]\n                 [7 8 9]]))\n\n  (def B (matrix [10 11 12]))\n\n  (bind-columns A B)\n\n  (bind-columns [1 2 3 4] [5 6 7 8])",
   :name "bind-columns"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L325",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/bind-rows",
   :namespace "incanter.core",
   :line 325,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "   Returns the matrix resulting from concatenating the given matrices\nand/or sequences by their rows. Equivalent to R's rbind.\n\nExamples:\n  (def A (matrix [[1 2 3]\n                 [4 5 6]\n                 [7 8 9]]))\n\n  (def B (matrix [[10 11 12]\n                  [13 14 15]]))\n\n  (bind-rows A B)\n\n  (bind-rows [1 2 3 4] [5 6 7 8])",
   :name "bind-rows"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2027",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/categorical-var",
   :namespace "incanter.core",
   :line 2027,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   " Returns a categorical variable based on the values in the given collection.\nEquivalent to R's factor function.\n\nOptions:\n  :data (default nil) factors will be extracted from the given data.\n  :ordered? (default false) indicates that the variable is ordinal.\n  :labels (default (sort (into #{} data)))\n  :levels (range (count labels))\n\nExamples:\n  (categorical-var :data [:a :a :c :b :a :c :c])\n  (categorical-var :labels [:a :b :c])\n  (categorical-var :labels [:a :b :c] :levels [10 20 30])\n  (categorical-var :levels [1 2 3])",
   :name "categorical-var"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L601",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/choose",
   :namespace "incanter.core",
   :line 601,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([n k]),
   :doc
   "\nReturns number of k-combinations (each of size k) from a set S with\nn elements (size n), which is the binomial coefficient (also known\nas the 'choose function') [wikipedia]\n      choose = n!/(k!(n - k)!)\n\nEquivalent to R's choose function.\n\nExamples:\n  (choose 25 6) ; => 2,598,960\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/math/tdouble/DoubleArithmetic.html\n  http://en.wikipedia.org/wiki/Combination",
   :name "choose"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1466",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/col-names",
   :namespace "incanter.core",
   :line 1466,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([data] [data colnames]),
   :doc
   "If given a dataset, it returns its column names. If given a dataset and a sequence\n  of column names, it returns a dataset with the given column names.\n\n  Examples:\n    (use '(incanter core datasets))\n    (def data (get-dataset :cars))\n    (col-names data)\n\n    (def renamed-data (col-names data [:x1 :x2]))\n    (col-names renamed-data)\n\n\n   ",
   :name "col-names"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L993",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/condition",
   :namespace "incanter.core",
   :line 993,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the two norm condition number, which is max(S) / min(S), where S is the diagonal matrix of singular values from an SVD decomposition.\n\n\nExamples:\n\n(use 'incanter.core)\n(def foo (matrix (range 9) 3))\n(condition foo)\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Condition_number\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleSingularValueDecompositionDC.html",
   :name "condition"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1412",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/conj-cols",
   :namespace "incanter.core",
   :line 1412,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Returns a dataset created by merging the given datasets and/or collections.\nThere must be the same number of rows in each dataset and/or collections. \n Column names are not preserved in order to prevent naming conflicts.\n\n Examples:\n   (use '(incanter core datasets))\n   (def cars (get-dataset :cars))\n   (def x (sel cars :cols 0))\n   (view (conj-cols cars cars))\n   (view (conj-cols cars x))\n   (view (conj-cols (range (nrow cars)) cars))\n   (view (conj-cols (range 10) (range 10)))\n   (view (conj-cols {:a 1 :b 2} {:c 1 :d 2}))",
   :name "conj-cols"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1441",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/conj-rows",
   :namespace "incanter.core",
   :line 1441,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Returns a dataset created by combining the rows of the given datasets and/or collections.\n\nExamples:\n\n  (use '(incanter core datasets))\n  (def cars (get-dataset :cars))\n  (view (conj-rows (to-dataset (range 5)) (to-dataset (range 5 10))))\n  (view (conj-rows cars cars))\n  (view (conj-rows [[1 2] [3 4]] [[5 6] [7 8]]))\n  (view (conj-rows [{:a 1 :b 2} {:a 3 :b 4}] [[5 6] [7 8]]))\n  (view (conj-rows (to-dataset [{:a 1 :b 2} {:a 3 :b 4}]) [[5 6] [7 8]]))\n  (conj-rows (range 5) (range 5 10))",
   :name "conj-rows"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L653",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/copy",
   :namespace "incanter.core",
   :line 653,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc "Returns a copy of the given matrix.",
   :name "copy"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L560",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/cos",
   :namespace "incanter.core",
   :line 560,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the cosine of the elements in the given matrix, sequence or number.\nEquivalent to R's cos function.",
   :name "cos"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L825",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/cumulative-sum",
   :namespace "incanter.core",
   :line 825,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([coll]),
   :doc
   " Returns a sequence of cumulative sum for the given collection. For instance\n  The first value equals the first value of the argument, the second value is\n  the sum of the first two arguments, the third is the sum of the first three\n  arguments, etc.\n\n  Examples:\n    (use 'incanter.core)\n    (cumulative-sum (range 100))\n",
   :name "cumulative-sum"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1142",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/dataset",
   :namespace "incanter.core",
   :line 1142,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([column-names & data]),
   :doc
   " Returns a map of type ::dataset constructed from the given column-names and\ndata. The data is either a sequence of sequences or a sequence of hash-maps.",
   :name "dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L105",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/dataset?",
   :namespace "incanter.core",
   :line 105,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([obj]),
   :doc " Determines if obj is of type ::dataset.",
   :name "dataset?"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L853",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/decomp-cholesky",
   :namespace "incanter.core",
   :line 853,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the Cholesky decomposition of the given matrix. Equivalent to R's\nchol function.\n\nReturns:\n  a matrix of the triangular factor (note: the result from\n  cern.colt.matrix.linalg.CholeskyDecomposition is transposed so\n  that it matches the result return from R's chol function.\n\n\n\nExamples:\n\n(use '(incanter core stats charts datasets))\n;; load the iris dataset\n(def iris (to-matrix (get-dataset :iris)))\n;; take the Cholesky decompostion of the correlation matrix of the iris data.\n(decomp-cholesky (correlation iris))\n\n\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleCholeskyDecomposition.html\n  http://en.wikipedia.org/wiki/Cholesky_decomposition",
   :name "decomp-cholesky"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L914",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/decomp-eigenvalue",
   :namespace "incanter.core",
   :line 914,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the Eigenvalue Decomposition of the given matrix. Equivalent to R's eig function.\n\nReturns:\n  a map containing:\n    :values -- vector of eigenvalues\n    :vectors -- the matrix of eigenvectors\n\n\nExamples:\n\n(use 'incanter.core)\n(def foo (matrix (range 9) 3))\n(decomp-eigenvalue foo)\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Eigenvalue_decomposition\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleEigenvalueDecomposition.html",
   :name "decomp-eigenvalue"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L940",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/decomp-lu",
   :namespace "incanter.core",
   :line 940,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the LU decomposition of the given matrix.\n\n\nExamples:\n\n(use 'incanter.core)\n(def foo (matrix (range 9) 3))\n(decomp-lu foo)\n\n\nReturns:\n  a map containing:\n    :L -- the lower triangular factor\n    :U -- the upper triangular factor\n\nReferences:\n  http://en.wikipedia.org/wiki/LU_decomposition\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleLUDecomposition.html",
   :name "decomp-lu"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L966",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/decomp-qr",
   :namespace "incanter.core",
   :line 966,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the QR decomposition of the given matrix. Equivalent to R's qr function.\n\n\nExamples:\n\n(use 'incanter.core)\n(def foo (matrix (range 9) 3))\n(decomp-qr foo)\n\n\n\nReturns:\n  a map containing:\n    :Q -- orthogonal factor\n    :R -- the upper triangular factor\n\nReferences:\n  http://en.wikipedia.org/wiki/QR_decomposition\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleQRDecomposition.html",
   :name "decomp-qr"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L884",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/decomp-svd",
   :namespace "incanter.core",
   :line 884,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the Singular Value Decomposition (SVD) of the given matrix. Equivalent to\nR's svd function.\n\nReturns:\n  a map containing:\n    :S -- the diagonal matrix of singular values\n    :U -- the left singular vectors U\n    :V -- the right singular vectors V\n\n\nExamples:\n\n(use 'incanter.core)\n(def foo (matrix (range 9) 3))\n(decomp-foo foo)\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Singular_value_decomposition\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleSingularValueDecompositionDC.html",
   :name "decomp-svd"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1882",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/deshape",
   :namespace "incanter.core",
   :line 1882,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   " Returns a dataset where the columns identified by :merge are collapsed into \n  two columns called :variable and :value. The values in these columns are grouped\n  by the columns identified by :group-by.\n\n  Examples:\n\n    (use '(incanter core charts datasets))\n    (with-data (->> (deshape :merge [:Ahmadinejad :Rezai :Karrubi :Mousavi] \n                              :group-by :Region\n                              :data (get-dataset :iran-election))\n                    ($order :value :desc))\n      (view $data)\n      (view (bar-chart :variable :value :group-by :Region :legend true))\n\n      (view (bar-chart :Region :value :group-by :variable \n                       :legend true :vertical false))\n\n      (view (bar-chart :Region :value :legend true :vertical false\n                       :data ($order :value :desc ($rollup :sum :value :Region)))))\n\n\n\n      (def data (to-dataset [{:subject \"John Smith\" :time 1 :age 33 :weight 90 :height 1.87}\n\t\t             {:subject \"Mary Smith\" :time 1 :height 1.54}]))\n      (view data)\n      (view (deshape :group-by [:subject :time] :merge [:age :weight :height] :data data))\n      (view (deshape :merge [:age :weight :height] :data data))\n      (view (deshape :group-by [:subject :time] :data data))\n\n      (view (deshape :merge [:age :weight :height] :remove-na false :data data))\n ",
   :name "deshape"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L738",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/det",
   :namespace "incanter.core",
   :line 738,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the determinant of the given matrix. Equivalent\nto R's det function.\n\nReferences:\n  http://en.wikipedia.org/wiki/LU_decomposition\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleLUDecomposition.html",
   :name "det"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L148",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/diag",
   :namespace "incanter.core",
   :line 148,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "   If given a matrix, diag returns a sequence of its diagonal elements.\nIf given a sequence, it returns a matrix with the sequence's elements\non its diagonal. Equivalent to R's diag function.\n\nExamples:\n  (diag [1 2 3 4])\n\n  (def A (matrix [[1 2 3]\n                  [4 5 6]\n                  [7 8 9]]))\n  (diag A)",
   :name "diag"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L131",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/dim",
   :namespace "incanter.core",
   :line 131,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns a vector with the number of rows and columns of the given matrix. ",
   :name "dim"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L469",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/div",
   :namespace "incanter.core",
   :line 469,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "   Performs element-by-element division on multiple matrices, sequences\nand/or numbers. Equivalent to R's / operator.\n\nExamples:\n\n  (def A (matrix [[1 2 3]\n                  [4 5 6]\n                  [7 8 9]]))\n  (div A A A)\n  (div A 2)\n  (div 2 A)\n  (div [1 2 3] [1 2 3])\n  (div [1 2 3] 2)\n  (div 2 [1 2 3])\n\n  (div [1 2 3]) ; returns [1 1/2 13]",
   :name "div"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L536",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/exp",
   :namespace "incanter.core",
   :line 536,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the exponential of the elements in the given matrix, sequence or number.\nEquivalent to R's exp function.",
   :name "exp"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L584",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/factorial",
   :namespace "incanter.core",
   :line 584,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([k]),
   :doc
   "\nReturns the factorial of k (k must be a positive integer). Equivalent to R's\nfactorial function.\n\nExamples:\n  (factorial 6)\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/math/tdouble/DoubleArithmetic.html\n  http://en.wikipedia.org/wiki/Factorial",
   :name "factorial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2134",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/gamma",
   :namespace "incanter.core",
   :line 2134,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nEquivalent to R's gamma function.\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/Gamma.html",
   :name "gamma"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1951",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/get-categories",
   :namespace "incanter.core",
   :line 1951,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([cols data]),
   :doc
   "\nGiven a dataset and one or more column keys, returns the set of categories for them.\n\nExamples:\n\n  (use '(incanter core datasets))\n  (get-categories :eye (get-dataset :hair-eye-color))\n  (get-categories [:eye :hair] (get-dataset :hair-eye-color))",
   :name "get-categories"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1073",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/group-by",
   :namespace "incanter.core",
   :line 1073,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat on-cols & options]),
   :doc
   " Groups the given matrix by the values in the columns indicated by the\n'on-cols' argument, returning a sequence of matrices. The returned\nmatrices are sorted by the value of the group column ONLY when there\nis only a single (non-vector) on-col argument.\n\nExamples:\n\n  (use '(incanter core datasets))\n  (def plant-growth (to-matrix (get-dataset :plant-growth)))\n  (group-by plant-growth 1)\n  ;; only return the first column\n  (group-by plant-growth 1 :cols 0)\n  ;; don't return the second column\n  (group-by plant-growth 1 :except-cols 1)\n\n  (def plant-growth-dummies (to-matrix (get-dataset :plant-growth) :dummies true))\n  (group-by plant-growth-dummies [1 2])\n  ;; return only the first column\n  (group-by plant-growth-dummies [1 2] :cols 0)\n  ;; don't return the last two columns\n  (group-by plant-growth-dummies [1 2] :except-cols [1 2])\n\n  ;; plot the plant groups\n  (use 'incanter.charts)\n  ;; can use destructuring if you know the number of groups\n  ;; groups are sorted only if the group is based on a single column value\n  (let [[ctrl trt1 trt2] (group-by plant-growth 1 :cols 0)]\n    (doto (box-plot ctrl)\n          (add-box-plot trt1)\n          (add-box-plot trt2)\n          view))",
   :name "group-by"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L782",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/half-vectorize",
   :namespace "incanter.core",
   :line 782,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the half-vectorization (i.e. vech) of the given matrix.\n  The half-vectorization, vech(A), of a symmetric nxn matrix A\n  is the n(n+1)/2 x 1 column vector obtained by vectorizing only\n  the upper triangular part of A.\n\n  For instance:\n    (= (half-vectorize (matrix [[a b] [b d]])) (matrix [a b d]))\n\n  Examples:\n    (def A (matrix [[1 2] [2 4]]))\n    (half-vectorize A)\n\n  References:\n    http://en.wikipedia.org/wiki/Vectorization_(mathematics)\n",
   :name "half-vectorize"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L138",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/identity-matrix",
   :namespace "incanter.core",
   :line 138,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([n]),
   :doc
   "   Returns an n-by-n identity matrix.\n\nExamples:\n  (identity-matrix 4)",
   :name "identity-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2154",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/incomplete-beta",
   :namespace "incanter.core",
   :line 2154,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([x a b]),
   :doc
   "\nReturns the non-regularized incomplete beta value.\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/Gamma.html",
   :name "incomplete-beta"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L686",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/kronecker",
   :namespace "incanter.core",
   :line 686,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   " Returns the Kronecker product of the given arguments.\n\nExamples:\n\n  (def x (matrix (range 6) 2))\n  (def y (matrix (range 4) 2))\n  (kronecker 4 x)\n  (kronecker x 4)\n  (kronecker x y)",
   :name "kronecker"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1052",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/length",
   :namespace "incanter.core",
   :line 1052,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([coll]),
   :doc
   " A version of count that works on collections, matrices, and numbers.\n  The length of a number is one, the length of a collection is its count\n  and the length of a matrix is the number of elements it contains (nrow*ncol).\n  Equivalent to R's length function.\n",
   :name "length"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L518",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/log",
   :namespace "incanter.core",
   :line 518,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the natural log of the elements in the given matrix, sequence or number.\nEquvalent to R's log function.",
   :name "log"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L530",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/log10",
   :namespace "incanter.core",
   :line 530,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the log base 10 of the elements in the given matrix, sequence or number.\nEquivalent to R's log10 function.",
   :name "log10"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L524",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/log2",
   :namespace "incanter.core",
   :line 524,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the log base 2 of the elements in the given matrix, sequence or number.\nEquivalent to R's log2 function.",
   :name "log2"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L58",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/matrix",
   :namespace "incanter.core",
   :line 58,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([data] [data ncol] [init-val rows cols]),
   :doc
   "\nReturns an instance of an incanter.Matrix, which is an extension of\ncern.colt.matrix.tdouble.impl.DenseColDoubleMatrix2D that implements the Clojure\ninterface clojure.lang.ISeq. Therefore Clojure sequence operations can\nbe applied to matrices. A matrix consists of a sequence of rows, where\neach row is a one-dimensional row matrix. One-dimensional matrices are\nin turn, sequences of numbers. Equivalent to R's matrix function.\n\nExamples:\n  (def A (matrix [[1 2 3] [4 5 6] [7 8 9]])) ; produces a 3x3 matrix\n  (def A2 (matrix [1 2 3 4 5 6 7 8 9] 3)) ; produces the same 3x3 matrix\n  (def B (matrix [1 2 3 4 5 6 7 8 9])) ; produces a 9x1 column vector\n\n  (first A) ; produces a row matrix [1 2 3]\n  (rest A) ; produces a sub matrix [[4 5 6] [7 8 9]]\n  (first (first A)) ; produces 1.0\n  (rest (first A)) ; produces a row matrix [2 3]\n\n  ; since (plus row1 row2) adds the two rows element-by-element\n  (reduce plus A) ; produces the sums of the columns\n\n  ; and since (sum row1) sums the elements of the row\n  (map sum A) ; produces the sums of the rows\n\n  ; you can filter the rows using Clojure's filter function\n  (filter #(> (nth % 1) 4) A) ; returns the rows where the second column is greater than 4.\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/DoubleMatrix2D.html",
   :name "matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L100",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/matrix?",
   :namespace "incanter.core",
   :line 100,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([obj]),
   :doc " Test if obj is 'derived' incanter.Matrix.",
   :name "matrix?"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L420",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/minus",
   :namespace "incanter.core",
   :line 420,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "   Performs element-by-element subtraction on multiple matrices, sequences\nand/or numbers. If only a single argument is provided, returns the\nnegative of the given matrix, sequence, or number. Equivalent to R's - operator.\n\n\nExamples:\n\n  (def A (matrix [[1 2 3]\n                  [4 5 6]\n                  [7 8 9]]))\n  (minus A)\n  (minus A A A)\n  (minus A 2)\n  (minus 2 A)\n  (minus [1 2 3] [1 2 3])\n  (minus [1 2 3] 2)\n  (minus 2 [1 2 3])\n  (minus [1 2 3])",
   :name "minus"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L658",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/mmult",
   :namespace "incanter.core",
   :line 658,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   " Returns the matrix resulting from the matrix multiplication of the\n  the given arguments. Equivalent to R's %*% operator.\n\n  Examples:\n\n    (def A (matrix [[1 2 3]\n                    [4 5 6]\n                    [7 8 9]]))\n    (mmult A (trans A))\n    (mmult A (trans A) A)\n\n  References:\n    http://en.wikipedia.org/wiki/Matrix_multiplication\n    http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/DoubleMatrix2D.html\n\n",
   :name "mmult"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L448",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/mult",
   :namespace "incanter.core",
   :line 448,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "   Performs element-by-element multiplication on multiple matrices, sequences\nand/or numbers. Equivalent to R's * operator.\n\nExamples:\n\n  (def A (matrix [[1 2 3]\n                  [4 5 6]\n                  [7 8 9]]))\n  (mult A A A)\n  (mult A 2)\n  (mult 2 A)\n  (mult [1 2 3] [1 2 3])\n  (mult [1 2 3] 2)\n  (mult 2 [1 2 3])",
   :name "mult"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L399",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/plus",
   :namespace "incanter.core",
   :line 399,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "   Performs element-by-element addition on multiple matrices, sequences\nand/or numbers. Equivalent to R's + operator.\n\nExamples:\n\n  (def A (matrix [[1 2 3]\n                  [4 5 6]\n                  [7 8 9]]))\n  (plus A A A)\n  (plus A 2)\n  (plus 2 A)\n  (plus [1 2 3] [1 2 3])\n  (plus [1 2 3] 2)\n  (plus 2 [1 2 3])",
   :name "plus"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L493",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/pow",
   :namespace "incanter.core",
   :line 493,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   " This is an element-by-element exponent function, raising the first argument\nby the exponents in the remaining arguments. Equivalent to R's ^ operator.",
   :name "pow"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L817",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/prod",
   :namespace "incanter.core",
   :line 817,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns the product of the given sequence.",
   :name "prod"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1240",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/query-dataset",
   :namespace "incanter.core",
   :line 1240,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([data query-map]),
   :doc
   "Queries the given dataset using the query-map, returning a new dataset.\n The query-map uses the the dataset's column-names as keys and a\n simple variant of the MongoDB query language. \n\n For instance, given a dataset with two columns, :x and :category,  to query \n for rows where :x equals 10, use the following query-map: {:x 10}.\n \n To indicate that :x should be between 10 and 20, use {:x {:$gt 10 :$lt 20}}.\n \n To indicate that :category should also be either :red, :green, or :blue, use :$in\n {:x {:$gt 10 :$lt 20} :y {:$in #{:green :blue :red}}}\n\n And to indicate that :category should not include :red, :green, or :blue, use :$nin\n {:x {:$gt 10 :$lt 20} :y {:$nin #{:green :blue :red}}}\n\n The available query terms include :$gt, :$lt, :$gte, :$lte, :$eq, :$ne, :$in, :$nin, $fn.\n\n A row predicate function can be used instead of a query-map. The function must accept \n a map, representing a row of the dataset, and return a boolean value indicating whether \n the row should be included in the new dataset.\n\nExamples:\n   (use '(incanter core datasets))\n   (def cars (get-dataset :cars))\n   \n   (view (query-dataset cars {:speed 10}))\n   (view (query-dataset cars {:speed {:$in #{17 14 19}}}))\n   (view (query-dataset cars {:speed {:$lt 20 :$gt 10}}))\n   (view (query-dataset cars {:speed {:$fn #(> (log %) 3)}}))\n\n   ;; use a row predicate function instead of a query map.\n   (view (query-dataset cars (fn [row] (> (/ (row \"speed\") (row \"dist\")) 1/2))))",
   :name "query-dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1203",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/query-to-pred",
   :namespace "incanter.core",
   :line 1203,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([query-map]),
   :doc
   "Given a query-map, it returns a function that accepts a hash-map and returns true if it \nsatisfies the conditions specified in the provided query-map.\n\nExamples:\n\n  (use 'incanter.core)\n  (def pred (query-to-pred {:x 5 :y 7}))\n  (pred {:x 5 :y 7 :z :d})\n\n  (def pred (query-to-pred {:x 5 :y {:$gt 5 :$lt 10}}))\n  (pred {:x 5 :y 7 :z :d})\n\n  (def pred (query-to-pred {:z {:$in #{:a :b}}}))\n  (pred {:x 5 :y 7 :z :d})",
   :name "query-to-pred"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2377",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/quit",
   :namespace "incanter.core",
   :line 2377,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([]),
   :doc " Exits the Clojure shell.",
   :name "quit"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1012",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/rank",
   :namespace "incanter.core",
   :line 1012,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the effective numerical matrix rank, which is the number of nonnegligible singular values.\n\n\nExamples:\n\n(use 'incanter.core)\n(def foo (matrix (range 9) 3))\n(rank foo)\n\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Matrix_rank\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/decomposition/DoubleSingularValueDecompositionDC.html",
   :name "rank"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2166",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/regularized-beta",
   :namespace "incanter.core",
   :line 2166,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([x a b]),
   :doc
   "\nReturns the regularized incomplete beta value. Equivalent to R's pbeta function.\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/Gamma.html\n  http://en.wikipedia.org/wiki/Regularized_incomplete_beta_function\n  http://mathworld.wolfram.com/RegularizedBetaFunction.html",
   :name "regularized-beta"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2383",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/save",
   :namespace "incanter.core",
   :line 2383,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "multimethod",
   :doc
   " Save is a multi-function that is used to write matrices, datasets and\ncharts (in png format) to a file.\n\nArguments:\n  obj -- is a matrix, dataset, or chart object\n  filename -- the filename to create.\n\nMatrix and dataset options:\n  :delim (default \\,) column delimiter\n  :header (default nil) an sequence of strings to be used as header line\n      for matrices the default value is nil, for datasets, the default is\n      the dataset's column-names array.\n  :append (default false) determines whether this given file should be\n      appended to. If true, a header will not be written to the file again.\n\nChart options:\n  :width (default 500)\n  :height (default 400)\n\n\nMatrix Examples:\n\n  (use '(incanter core io))\n  (def A (matrix (range 12) 3)) ; creates a 3x4 matrix\n  (save A \"A.dat\") ; writes A to the file A.dat, with no header and comma delimited\n  (save A \"A.dat\" :delim \\tab) ; writes A to the file A.dat, with no header and tab delimited\n\n  ;; writes A to the file A.dat, with a header and tab delimited\n  (save A \"A.dat\" :delim \\, :header [\"col1\" \"col2\" \"col3\"])\n\n\nDataset Example:\n\n  (use '(incanter core io datasets))\n  ;; read the iris sample dataset, and save it to a file.\n  (def iris (get-dataset :iris))\n  (save iris \"iris.dat\")\n\n\nChart Example:\n\n  (use '(incanter core io stats charts))\n  (save (histogram (sample-normal 1000)) \"hist.png\")\n\n  ;; chart example using java.io.OutputStream instead of filename\n  (use '(incanter core stats charts))\n  (import 'java.io.FileOutputStream)\n  (def fos (FileOutputStream. \"/tmp/hist.png\"))\n  (def hist (histogram (sample-normal 1000)))\n  (save hist fos)\n  (.close fos)\n\n  (view \"file:///tmp/hist.png\")",
   :name "save"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L208",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/sel",
   :namespace "incanter.core",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "multimethod",
   :doc
   "\nReturns an element or subset of the given matrix, or dataset.\n\nArgument:\n  a matrix object or dataset.\n\nOptions:\n  :rows (default true)\n    returns all rows by default, can pass a row index or sequence of row indices\n  :cols (default true)\n    returns all columns by default, can pass a column index or sequence of column indices\n  :except-rows (default nil) can pass a row index or sequence of row indices to exclude\n  :except-cols (default nil) can pass a column index or sequence of column indices to exclude\n  :filter (default nil)\n    a function can be provided to filter the rows of the matrix\n\nExamples:\n  (use 'incanter.datasets)\n  (def iris (to-matrix (get-dataset :iris)))\n  (sel iris 0 0) ; first element\n  (sel iris :rows 0 :cols 0) ; also first element\n  (sel iris :cols 0) ; first column of all rows\n  (sel iris :cols [0 2]) ; first and third column of all rows\n  (sel iris :rows (range 10) :cols (range 2)) ; first two columns of the first 10 rows\n  (sel iris :rows (range 10)) ; all columns of the first 10 rows\n\n  ;; exclude rows or columns\n  (sel iris :except-rows (range 10)) ; all columns of all but the first 10 rows\n  (sel iris :except-cols 1) ; all columns except the second\n\n  ;; return only the first 10 even rows\n  (sel iris :rows (range 10) :filter #(even? (int (nth % 0))))\n  ;; select rows where distance (third column) is greater than 50\n  (sel iris :filter #(> (nth % 2) 4))\n\n  ;; examples with datasets\n  (use 'incanter.datasets)\n  (def us-arrests (get-dataset :us-arrests))\n  (sel us-arrests :cols \"State\")\n  (sel us-arrests :cols :State)\n\n  (sel us-arrests :cols [\"State\" \"Murder\"])\n  (sel us-arrests :cols [:State :Murder])",
   :name "sel"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L548",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/sin",
   :namespace "incanter.core",
   :line 548,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the sine of the elements in the given matrix, sequence or number.\nEquivalent to R's sin function.",
   :name "sin"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L719",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/solve",
   :namespace "incanter.core",
   :line 719,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A & B]),
   :doc
   " Returns a matrix solution if A is square, least squares solution otherwise.\nEquivalent to R's solve function.\n\nExamples:\n  (solve (matrix [[2 0 0] [0 2 0] [0 0 2]]))\n\nReferences:\n  http://en.wikipedia.org/wiki/Matrix_inverse",
   :name "solve"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2184",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/solve-quadratic",
   :namespace "incanter.core",
   :line 2184,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([a b c]),
   :doc
   "\nReturns a vector with the solution to x from the quadratic\nequation, a*x^2 + b*x + c.\n\nArguments:\n  a, b, c: coefficients of a qaudratic equation.\n\nExamples:\n  ;; -2*x^2 + 7*x + 15\n  (quadratic-formula -2 7 15)\n  ;; x^2 + -2*x + 1\n  (quadratic-formula 1 -2 1)\n\nReferences:\n  http://en.wikipedia.org/wiki/Quadratic_formula",
   :name "solve-quadratic"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L512",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/sq",
   :namespace "incanter.core",
   :line 512,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the square of the elements in the given matrix, sequence or number.\nEquivalent to R's sq function.",
   :name "sq"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L506",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/sqrt",
   :namespace "incanter.core",
   :line 506,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the square-root of the elements in the given matrix, sequence or number.\nEquivalent to R's sqrt function.",
   :name "sqrt"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L810",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/sum",
   :namespace "incanter.core",
   :line 810,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns the sum of the given sequence.",
   :name "sum"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L803",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/sum-of-squares",
   :namespace "incanter.core",
   :line 803,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "Returns the sum-of-squares of the given sequence.",
   :name "sum-of-squares"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2211",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/symmetric-matrix",
   :namespace "incanter.core",
   :line 2211,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([data & options]),
   :doc
   "\nReturns a symmetric matrix from the given data, which represents the lower triangular elements\nordered by row. This is not the inverse of half-vectorize which returns a vector of the upper-triangular\nvalues, unless the :lower option is set to false.\n\nOptions:\n  :lower (default true) -- lower-triangular. Set :lower to false to reverse the half-vectorize function.\n\nExamples:\n\n  (use 'incanter.core)\n  (symmetric-matrix [1\n                     2 3\n                     4 5 6\n                     7 8 9 10])\n\n\n  (half-vectorize\n    (symmetric-matrix [1\n                       2 3\n                       4 5 6\n                       7 8 9 10] :lower false))",
   :name "symmetric-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L572",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/tan",
   :namespace "incanter.core",
   :line 572,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([A]),
   :doc
   "Returns the tangent of the elements in the given matrix, sequence or number.\nEquivalent to R's tan function.",
   :name "tan"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1353",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-dataset",
   :namespace "incanter.core",
   :line 1353,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([obj & options]),
   :doc
   "Returns a dataset containing the given values.\n\nExamples:\n\n  (use 'incanter.core)\n  (to-dataset 1)\n  (to-dataset :a)\n  (to-dataset [:a])\n  (to-dataset (range 10))\n  (to-dataset (range 10) :transpose true)\n  (to-dataset [[1 2] [3 4] [5 6]])\n  (to-dataset {:a 1 :b 2 :c 3})\n  (to-dataset {\"a\" 1 \"b\" 2 \"c\" 3})\n  (to-dataset [{:a 1 :b 2} {:a 1 :b 2}])\n  (to-dataset [{\"a\" 1 \"b\" 2 \"c\" 3} {\"a\" 1 \"b\" 2 \"c\" 3}])",
   :name "to-dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2070",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-labels",
   :namespace "incanter.core",
   :line 2070,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([coll cat-var]),
   :doc "\n",
   :name "to-labels"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2060",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-levels",
   :namespace "incanter.core",
   :line 2060,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([coll & options]),
   :doc "\n",
   :name "to-levels"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L626",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-list",
   :namespace "incanter.core",
   :line 626,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "multimethod",
   :doc
   " Returns a list-of-lists if the given matrix is two-dimensional\nand a flat list if the matrix is one-dimensional.",
   :name "to-list"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1994",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-map",
   :namespace "incanter.core",
   :line 1994,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "multimethod",
   :doc
   "Takes a dataset or matrix and returns a hash-map where the keys are \n keyword versions of the column names, for datasets, or numbers, for \n matrices, and the values are sequence of the column values.\n\nExamples:\n  (use '(incanter core datasets))\n\n  (to-map (get-dataset :cars))\n\n  (to-map (matrix (range 9) 3))",
   :name "to-map"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2107",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-matrix",
   :namespace "incanter.core",
   :line 2107,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([dataset & options]),
   :doc
   "Converts a dataset into a matrix. Equivalent to R's as.matrix function\n for datasets.\n\nOptions:\n  :dummies (default false) -- if true converts non-numeric variables into sets\n                              of binary dummy variables, otherwise converts\n                              them into numeric codes.",
   :name "to-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1038",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/to-vect",
   :namespace "incanter.core",
   :line 1038,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns a vector-of-vectors if the given matrix is two-dimensional\nand a flat vector if the matrix is one-dimensional. This is a bit\nslower than the to-list function. ",
   :name "to-vect"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L750",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/trace",
   :namespace "incanter.core",
   :line 750,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the trace of the given matrix.\n\nReferences:\n  http://en.wikipedia.org/wiki/Matrix_trace\n  http://incanter.org/docs/parallelcolt/api/cern/colt/matrix/tdouble/algo/DoubleAlgebra.html",
   :name "trace"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L173",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/trans",
   :namespace "incanter.core",
   :line 173,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   "   Returns the transpose of the given matrix. Equivalent to R's t function\n\nExamples:\n  (def A (matrix [[1 2 3]\n                 [4 5 6]\n                 [7 8 9]]))\n\n  (trans A)",
   :name "trans"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L761",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/vectorize",
   :namespace "incanter.core",
   :line 761,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "function",
   :arglists ([mat]),
   :doc
   " Returns the vectorization (i.e. vec) of the given matrix.\n  The vectorization of an m-by-n matrix A, denoted by vec(A)\n  is the m*n-by-1 column vector obtain by stacking the columns\n  of the matrix A on top of one another.\n\n  For instance:\n    (= (vectorize (matrix [[a b] [c d]])) (matrix [a c b d]))\n\n  Examples:\n    (def A (matrix [[1 2] [3 4]]))\n    (vectorize A)\n\n  References:\n    http://en.wikipedia.org/wiki/Vectorization_(mathematics)\n",
   :name "vectorize"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L2257",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/view",
   :namespace "incanter.core",
   :line 2257,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "multimethod",
   :doc
   " This is a general 'view' function. When given an Incanter matrix/dataset\nor a Clojure numeric collection, it will display it in a Java Swing\nJTable. When given an Incanter chart object, it will display it in a new\nwindow. When given a URL string, it will open the location with the\nplatform's default web browser.\n\nWhen viewing charts, a :width (default 500) and :height (default 400) \noption can be provided.\n\nWhen viewing an incanter.processing sketch, set the :exit-on-close option\nto true (default is false) to kill the animation processes when you\nclose the window (this will also kill your REPL or Swank server), \notherwise those processing will continue to run in the background.\n\n\n\nExamples:\n\n  (use '(incanter core stats datasets charts))\n\n  ;; view matrices\n  (def rand-mat (matrix (sample-normal 100) 4))\n  (view rand-mat)\n\n  ;; view numeric collections\n  (view [1 2 3 4 5])\n  (view (sample-normal 100))\n\n  ;; view Incanter datasets\n  (view (get-dataset :iris))\n\n  ;; convert dataset to matrix, changing Species names to numeric codes\n  (view (to-matrix (get-dataset :iris)))\n\n  ;; convert dataset to matrix, changing Species names to dummy variables\n  (view (to-matrix (get-dataset :iris) :dummies true))\n\n  ;; view a chart\n  (view (histogram (sample-normal 1000)))\n\n  ;; view a URL\n  (view \"http://incanter.org\")\n\n  ;; view a PNG file\n  (save (histogram (sample-normal 1000)) \"/tmp/norm_hist.png\")\n  (view \"file:///tmp/norm_hist.png\")",
   :name "view"}
  {:source-url
   "http://github.com/liebke/incanter/blob/b7407dfedcb5543e14341c8b7b9cf102b02e5109/modules/incanter-core/src/main/clojure/incanter/core.clj#L1970",
   :wiki-url
   "http://liebke.github.com/incanter//core-api.html#incanter.core/with-data",
   :namespace "incanter.core",
   :line 1970,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/core.clj",
   :var-type "macro",
   :arglists ([data-binding & body]),
   :doc
   "Binds the given data to $data and executes the body.\n  Typically used with the $ and $where functions.\n\n Examples:\n   (use '(incanter core stats charts datasets))\n \n   (with-data  (get-dataset :cars)\n     (def lm (linear-model ($ :dist) ($ :speed)))\n     (doto (scatter-plot ($ :speed) ($ :dist))\n               (add-lines ($ :speed) (:fitted lm))\n                view))\n\n    ;; create a dataset where :speed greater than 10 or less than -10\n    (with-data (get-dataset :cars)\n      (view (-> ($where {:speed {:$gt 20}}) \n                      (conj-rows ($where {:speed {:$lt 10}})))))\n",
   :name "with-data"}
  {:source-url
   "http://github.com/liebke/incanter/blob/5357ddc0b170aa0fa6058ea07a184695b754f62e/modules/incanter-io/src/main/clojure/incanter/datasets.clj#L92",
   :wiki-url
   "http://liebke.github.com/incanter//datasets-api.html#incanter.datasets/get-dataset",
   :namespace "incanter.datasets",
   :line 92,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/datasets.clj",
   :var-type "function",
   :arglists ([dataset-key & options]),
   :doc
   " Returns the sample dataset associated with the given key. Most datasets\nare from R's sample data sets, as are the descriptions below.\n\nOptions:\n\n  :incanter-home -- if the incanter.home property is not set when the JVM is\n                    started (using -Dincanter.home) or there is no INCANTER_HOME\n                    environment variable set, use the :incanter-home options to \n                    provide the parent directory of the sample data directory.\n\n  :from-repo (default false) -- If true, retrieves the dataset from the online repository \n                     instead of locally, it will do this by default if incanter-home is not set.\n\n\nDatasets:\n\n  :iris -- the Fisher's or Anderson's Iris data set gives the\n           measurements in centimeters of the variables sepal\n           length and width and petal length and width,\n           respectively, for 50 flowers from each of 3 species\n           of iris.\n\n  :cars -- The data give the speed of cars and the distances taken\n            to stop. Note that the data were recorded in the 1920s.\n\n  :survey -- survey data used in Scott Lynch's 'Introduction to Applied Bayesian Statistics\n             and Estimation for Social Scientists'\n\n  :us-arrests -- This data set contains statistics, in arrests per 100,000\n                 residents for assault, murder, and rape in each of the 50 US\n                 states in 1973. Also given is the percent of the population living\n                 in urban areas.\n\n  :flow-meter -- flow meter data used in Bland Altman Lancet paper.\n\n  :co2 -- has 84 rows and 5 columns of data from an experiment on the cold tolerance\n          of the grass species _Echinochloa crus-galli_.\n\n  :chick-weight -- has 578 rows and 4 columns from an experiment on the effect of diet\n                   on early growth of chicks.\n\n  :plant-growth -- Results from an experiment to compare yields (as measured by dried\n                   weight of plants) obtained under a control and two different\n                   treatment conditions.\n\n  :pontius -- These data are from a NIST study involving calibration of load cells.\n              The response variable (y) is the deflection and the predictor variable\n              (x) is load.\n              See http://www.itl.nist.gov/div898/strd/lls/data/Pontius.shtml\n\n  :filip -- NIST data set for linear regression certification,\n            see http://www.itl.nist.gov/div898/strd/lls/data/Filip.shtml\n\n  :longely -- This classic dataset of labor statistics was one of the first used to\n              test the accuracy of least squares computations. The response variable\n              (y) is the Total Derived Employment and the predictor variables are GNP\n              Implicit Price Deflator with Year 1954 = 100 (x1), Gross National Product\n              (x2), Unemployment (x3), Size of Armed Forces (x4), Non-Institutional\n              Population Age 14 & Over (x5), and Year (x6).\n              See http://www.itl.nist.gov/div898/strd/lls/data/Longley.shtml\n\n  :Chwirut -- These data are the result of a NIST study involving ultrasonic calibration.\n              The response variable is ultrasonic response, and the predictor variable is\n              metal distance.\n              See http://www.itl.nist.gov/div898/strd/nls/data/LINKS/DATA/Chwirut1.dat\n\n  :thurstone -- test data for non-linear least squares.\n\n  :austres -- Quarterly Time Series of the Number of Australian Residents\n\n  :hair-eye-color -- Hair and eye color of sample of students\n\n  :airline-passengers -- Monthly Airline Passenger Numbers 1949-1960\n\n  :math-prog -- Pass/fail results for a high school mathematics assessment test\n                and a freshmen college programming course.\n\n  :iran-election -- Vote counts for 30 provinces from the 2009 Iranian election.\n\n Examples:\n   (def data (get-dataset :cars))\n   (def data2 (get-dataset :cars :incanter.home \"/usr/local/packages/incanter\"))",
   :name "get-dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj#L14",
   :wiki-url
   "http://liebke.github.com/incanter//incremental-stats-api.html#incanter.incremental-stats/mean-state",
   :namespace "incanter.incremental-stats",
   :line 14,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj",
   :var-type "function",
   :arglists ([x val queue]),
   :doc "",
   :name "mean-state"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj#L65",
   :wiki-url
   "http://liebke.github.com/incanter//incremental-stats-api.html#incanter.incremental-stats/tuplize-apply",
   :namespace "incanter.incremental-stats",
   :line 65,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "",
   :name "tuplize-apply"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj#L43",
   :wiki-url
   "http://liebke.github.com/incanter//incremental-stats-api.html#incanter.incremental-stats/update-mean",
   :namespace "incanter.incremental-stats",
   :line 43,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj",
   :var-type "function",
   :arglists ([x] [x & xs]),
   :doc "",
   :name "update-mean"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj#L37",
   :wiki-url
   "http://liebke.github.com/incanter//incremental-stats-api.html#incanter.incremental-stats/update-sample",
   :namespace "incanter.incremental-stats",
   :line 37,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/incremental_stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc "",
   :name "update-sample"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/information_theory.clj#L57",
   :wiki-url
   "http://liebke.github.com/incanter//information-theory-api.html#incanter.information-theory/entropy",
   :namespace "incanter.information-theory",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/information_theory.clj",
   :var-type "function",
   :arglists ([counts]),
   :doc "takes a map of class label to counts",
   :name "entropy"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/information_theory.clj#L69",
   :wiki-url
   "http://liebke.github.com/incanter//information-theory-api.html#incanter.information-theory/gain",
   :namespace "incanter.information-theory",
   :line 69,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/information_theory.clj",
   :var-type "function",
   :arglists ([data]),
   :doc
   "\ncomputes information gain from count matrix of feature class labels to predicted class labels.\n\nexample: (gain {:weak {:positive 6 :negative 2} \n\t\t:strong {:positive 3 :negative 3}})",
   :name "gain"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/information_theory.clj#L21",
   :wiki-url
   "http://liebke.github.com/incanter//information-theory-api.html#incanter.information-theory/gini-impurity",
   :namespace "incanter.information-theory",
   :line 21,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/information_theory.clj",
   :var-type "function",
   :arglists ([counts]),
   :doc
   "Gini impurity is  measure of how often a randoincanter. chosen element from the set would be incorrectly labelled if it were randoincanter. labelled according to the distribution of labels in the subset. Gini impurity can be computed by summing the probability of each item being chosen times the probability of a mistake in categorizing that item. It reaches its minimum (zero) when all cases in the node fall into a single target category.",
   :name "gini-impurity"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/information_theory.clj#L32",
   :wiki-url
   "http://liebke.github.com/incanter//information-theory-api.html#incanter.information-theory/kl-divergence",
   :namespace "incanter.information-theory",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/information_theory.clj",
   :var-type "function",
   :arglists ([p-counts q-counts]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Kullback%E2%80%93Leibler_divergence\n\nIn probability theory and information theory, the Kullback–Leibler divergence (also information divergence, information gain, or relative entropy) is a non-symmetric measure of the difference between two probability distributions P and Q. KL measures the expected number of extra bits required to code samples from P when using a code based on Q, rather than using a code based on P. Typically P represents the true distribution of data, observations, or a precise calculated theoretical distribution. The measure Q typically represents a theory, model, description, or approximation of P.\n\ntakes a map of class label to counts.\nnote the (> p 0) predicate defines (* 0 (log2 0)) as 0 rather than NaN\n\nassumes you pass in distributions as nested maps and flattens them before applying the algorithm. ",
   :name "kl-divergence"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/information_theory.clj#L97",
   :wiki-url
   "http://liebke.github.com/incanter//information-theory-api.html#incanter.information-theory/mutual-information",
   :namespace "incanter.information-theory",
   :line 97,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/information_theory.clj",
   :var-type "function",
   :arglists ([joint individuals]),
   :doc
   "mutual information is the Kullback-Leibler divergence between the product of the marginal distributions of two random variables, p(x)p(y), and the the random variables' joint distribution, p(x,y).\n\nsee: http://en.wikipedia.org/wiki/Mutual_information",
   :name "mutual-information"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/information_theory.clj#L88",
   :wiki-url
   "http://liebke.github.com/incanter//information-theory-api.html#incanter.information-theory/total-correlation",
   :namespace "incanter.information-theory",
   :line 88,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/information_theory.clj",
   :var-type "function",
   :arglists ([joint individuals]),
   :doc
   "total correlation is a multivariate generalization of mutual information.  it is the Kullback-Leibler divergence between the joint distribution of a set and its maximum entropy product approximation.\n\nsee: http://en.wikipedia.org/wiki/Total_correlation",
   :name "total-correlation"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/internal.clj#L32",
   :wiki-url
   "http://liebke.github.com/incanter//internal-api.html#incanter.internal/is-matrix",
   :namespace "incanter.internal",
   :line 32,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/internal.clj",
   :var-type "function",
   :arglists ([obj]),
   :doc
   " Test if obj is 'derived' from ::matrix (e.g. class incanter.Matrix).",
   :name "is-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/internal.clj#L227",
   :wiki-url
   "http://liebke.github.com/incanter//internal-api.html#incanter.internal/safe",
   :namespace "incanter.internal",
   :line 227,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/internal.clj",
   :var-type "function",
   :arglists ([f n d]),
   :doc "for safe division - returns zero for division by zero",
   :name "safe"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/internal.clj#L202",
   :wiki-url
   "http://liebke.github.com/incanter//internal-api.html#incanter.internal/vector-comp",
   :namespace "incanter.internal",
   :line 202,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/internal.clj",
   :var-type "function",
   :arglists ([& fns]),
   :doc
   "compose a list of functions such that they are each applied to the arguments to which the composed function is applied and the results of each application are inserted as slots in a vector.",
   :name "vector-comp"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L208",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/clj-to-json-file",
   :namespace "incanter.io",
   :line 208,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([c f]),
   :doc "",
   :name "clj-to-json-file"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L329",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/columns",
   :namespace "incanter.io",
   :line 329,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([& x]),
   :doc "",
   :name "columns"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L250",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/csv-line",
   :namespace "incanter.io",
   :line 250,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([v]),
   :doc "turn a vector into a csv line",
   :name "csv-line"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L261",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/csv-table",
   :namespace "incanter.io",
   :line 261,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([m]),
   :doc "turn a 2-level map into a csv table",
   :name "csv-table"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L244",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/into-file",
   :namespace "incanter.io",
   :line 244,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([filename stuff]),
   :doc "",
   :name "into-file"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L228",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/json-from-classpath",
   :namespace "incanter.io",
   :line 228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "",
   :name "json-from-classpath"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L216",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/load-resource",
   :namespace "incanter.io",
   :line 216,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "",
   :name "load-resource"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L302",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/query",
   :namespace "incanter.io",
   :line 302,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([table sample & columns]),
   :doc "",
   :name "query"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L92",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/read-dataset",
   :namespace "incanter.io",
   :line 92,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([filename & options]),
   :doc
   "\n  Returns a dataset read from a file or a URL.\n\n  Options:\n    :delim (default \\,), other options (\\tab \\space \\|  etc)\n    :quote (default \\\") character used for quoting strings\n    :skip (default 0) the number of lines to skip at the top of the file.\n    :header (default false) indicates the file has a header line\n    :compress-delim (default true if delim = \\space, false otherwise) means\n                    compress multiple adjacent delimiters into a single delimiter\n",
   :name "read-dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L223",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/read-from-classpath",
   :namespace "incanter.io",
   :line 223,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "",
   :name "read-from-classpath"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L196",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/read-json-file",
   :namespace "incanter.io",
   :line 196,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([f]),
   :doc "",
   :name "read-json-file"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L319",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/sql-order-by",
   :namespace "incanter.io",
   :line 319,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([c]),
   :doc "",
   :name "sql-order-by"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L295",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/sql-query",
   :namespace "incanter.io",
   :line 295,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([d q]),
   :doc "",
   :name "sql-query"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L309",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/sql-select",
   :namespace "incanter.io",
   :line 309,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([& x]),
   :doc "",
   :name "sql-select"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L324",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/sql-where",
   :namespace "incanter.io",
   :line 324,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([pred]),
   :doc "",
   :name "sql-where"}
  {:source-url
   "http://github.com/liebke/incanter/blob/8d4cf1c5cbe4034c53fd5ed0070bb74ef84aafba/modules/incanter-io/src/main/clojure/incanter/io.clj#L274",
   :wiki-url
   "http://liebke.github.com/incanter//io-api.html#incanter.io/with-mysql-results",
   :namespace "incanter.io",
   :line 274,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-io/src/main/clojure/incanter/io.clj",
   :var-type "function",
   :arglists ([dbinfo query f]),
   :doc
   "\ntakes dbinfo, query and a fn and applys the fn to query results.\n\nexample dbinfo:\n\n {:host \"localhost\"\n :port 3306\n :name \"testimport\"\n :classname \"com.mysql.jdbc.Driver\"\n :subprotocol \"mysql\"\n :user \"root\"\n :password \"12345\"}",
   :name "with-mysql-results"}
  {:source-url
   "http://github.com/liebke/incanter/blob/14c4fc6145365e917c6e01639f11562a169f436a/modules/incanter-mongodb/src/main/clojure/incanter/mongodb.clj#L72",
   :wiki-url
   "http://liebke.github.com/incanter//mongodb-api.html#incanter.mongodb/fetch-dataset",
   :namespace "incanter.mongodb",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-mongodb/src/main/clojure/incanter/mongodb.clj",
   :var-type "function",
   :arglists ([& args]),
   :doc
   "Queries a MongoDB database, accepting the same arguments as \nsomnium.congomongo/fetch, but returning an Incanter dataset instead \nof a sequence of maps.\n\nExamples:\n\n   (use '(incanter core datasets mongodb))\n   (use 'somnium.congomongo)\n\n   ;; first load some sample data\n   (def data (get-dataset :airline-passengers))\n   (view data)\n\n   ;; a MongoDB server must be running on the localhost on the default port\n   ;; for the following steps.\n\n   (mongo! :db \"mydb\")\n   (mass-insert! :airline-data (:rows data))\n\n   ;; and then retrieve it\n   ;; notice that the retrieved data set has two additional columns,  :_id :_ns\n   (view (fetch-dataset :airline-data))",
   :name "fetch-dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/14c4fc6145365e917c6e01639f11562a169f436a/modules/incanter-mongodb/src/main/clojure/incanter/mongodb.clj#L104",
   :wiki-url
   "http://liebke.github.com/incanter//mongodb-api.html#incanter.mongodb/insert-dataset",
   :namespace "incanter.mongodb",
   :line 104,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-mongodb/src/main/clojure/incanter/mongodb.clj",
   :var-type "function",
   :arglists ([mongodb-coll dataset]),
   :doc
   "Inserts the rows of the Incanter dataset into the given MongoDB collection.\n\nExamples:\n\n(use '(incanter core datasets mongodb))\n(use 'somnium.congomongo)\n\n(def data (get-dataset :airline-passengers))\n(view data)\n\n;; a MongoDB server must be running on the localhost on the default port\n;; for the following steps.\n\n(mongo! :db \"mydb\")\n(mass-insert! :airline-data (:rows data))\n\n;; notice that the retrieved data set has two additional columns,  :_id :_ns\n(view (fetch-dataset :airline-data))",
   :name "insert-dataset"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/optimize.clj#L68",
   :wiki-url
   "http://liebke.github.com/incanter//optimize-api.html#incanter.optimize/derivative",
   :namespace "incanter.optimize",
   :line 68,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/optimize.clj",
   :var-type "function",
   :arglists ([f & options]),
   :doc
   "\nReturns a function that approximates the derivative of the given function.\n\nOptions:\n  :dx (default 0.0001)\n\nExamples:\n\n  (use '(incanter core optimize charts stats))\n  (defn cube [x] (* x x x))\n  (def cube-deriv (derivative cube))\n  (cube-deriv 2) ; value: 12.000600010022566\n  (cube-deriv 3) ; value: 27.00090001006572\n  (cube-deriv 4) ; value: 48.00120000993502\n\n  (def x (range -3 3 0.1))\n  (def plot (xy-plot x (map cube x)))\n  (view plot)\n  (add-lines plot x (map cube-deriv x))\n\n  ;; get the second derivative function\n  (def cube-deriv2 (derivative cube-deriv))\n  (add-lines plot x (map cube-deriv2 x))\n\n  ;; plot the normal pdf and its derivatives\n  (def plot (xy-plot x (pdf-normal x)))\n  (view plot)\n  (def pdf-deriv (derivative pdf-normal))\n  (add-lines plot x (pdf-deriv x))\n\n  ;; plot the second derivative function\n  (def pdf-deriv2 (derivative pdf-deriv))\n  (add-lines plot x (pdf-deriv2 x))",
   :name "derivative"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/optimize.clj#L251",
   :wiki-url
   "http://liebke.github.com/incanter//optimize-api.html#incanter.optimize/gradient",
   :namespace "incanter.optimize",
   :line 251,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/optimize.clj",
   :var-type "function",
   :arglists ([f start & options]),
   :doc
   "\nReturns a function that calculates a 5-point approximation to\nthe gradient of the given function. The vector of start values are\nused to determine the number of parameters required by the function, and\nto scale the step-size. The generated function accepts a vector of\nparameter values and a vector of x data points and returns a matrix,\nwhere each row is the gradient evaluated at the corresponding x value.\n\nExamples:\n\n  (use '(incanter core optimize datasets charts))\n  (defn f [theta x]\n    (+ (nth theta 0)\n          (div (* x (- (nth theta 1) (nth theta 0)))\n               (+ (nth theta 2) x))))\n\n  (def start [20 200 100])\n  (def data (to-matrix (get-dataset :thurstone)))\n  (def x (sel data :cols 1))\n  (def y (sel data :cols 0))\n  ;; view the data\n  (view (scatter-plot x y))\n\n  (def grad (gradient f start))\n  (time (doall (grad start x)))",
   :name "gradient"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/optimize.clj#L300",
   :wiki-url
   "http://liebke.github.com/incanter//optimize-api.html#incanter.optimize/hessian",
   :namespace "incanter.optimize",
   :line 300,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/optimize.clj",
   :var-type "function",
   :arglists ([f start & options]),
   :doc
   " Returns a function that calculates an approximation to the Hessian matrix\nof the given function. The vector of start values are used to determine\nthe number of parameters required by the function, and to scale the\nstep-size. The generated function accepts a vector of\nparameter values and a vector of x data points and returns a matrix,\nwhere each row with p*(p+1)/2 columns, one for each unique entry in\nthe Hessian evaluated at the corresponding x value.\n\nExamples:\n\n  (use '(incanter core optimize datasets charts))\n  (defn f [theta x]\n    (+ (nth theta 0)\n          (div (* x (- (nth theta 1) (nth theta 0)))\n               (+ (nth theta 2) x))))\n\n  (def start [20 200 100])\n  (def data (to-matrix (get-dataset :thurstone)))\n  (def x (sel data :cols 1))\n  (def y (sel data :cols 0))\n  ;; view the data\n  (view (scatter-plot x y))\n\n  (time (def hess (hessian f start)))\n  (time (doall (hess start x)))",
   :name "hessian"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/optimize.clj#L26",
   :wiki-url
   "http://liebke.github.com/incanter//optimize-api.html#incanter.optimize/integrate",
   :namespace "incanter.optimize",
   :line 26,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/optimize.clj",
   :var-type "function",
   :arglists ([f a b]),
   :doc
   " Integrate a function f from a to b\n\n\nExamples:\n  (defn f1 [x] 1)\n  (defn f2 [x] (Math/pow x 2))\n  (defn f3 [x] (* x (Math/exp (Math/pow x 2))))\n\n  (integrate f1 0 5)\n  (integrate f2 0 1)\n  (integrate f3 0 1)\n\n  ;; normal distribution\n  (def std 1)\n  (def mu 0)\n  (defn normal [x]\n    (/ 1\n      (* (* std (Math/sqrt (* 2 Math/PI)))\n        (Math/exp (/ (Math/pow (- (- x mu)) 2)\n        (* 2 (Math/pow std 2)))))))\n\n  (integrate normal 1.96 10)\n\n\nReference:\n  http://jng.imagine27.com/articles/2009-04-09-161839_integral_calculus_in_lambda_calculus_lisp.html\n  http://iam.elbenshira.com/archives/151_integral-calculus-in-haskell/",
   :name "integrate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/optimize.clj#L588",
   :wiki-url
   "http://liebke.github.com/incanter//optimize-api.html#incanter.optimize/non-linear-model",
   :namespace "incanter.optimize",
   :line 588,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/optimize.clj",
   :var-type "function",
   :arglists ([f y x start & options]),
   :doc
   "\nDetermine the nonlinear least-squares estimates of the\nparameters of a nonlinear model.\nBased on R's nls (non-linear least squares) function.\n\nArguments:\n  f -- model function, takes two argumetns the first a list of parameters\n       that are to be estimated, and an x value.\n  y -- sequence of dependent data\n  x -- sequence of independent data\n  start -- start values for the parameters to be estimated\n\nOptions:\n  :method (default :gauss-newton) other option :newton-raphson\n  :tol (default 1E-5)\n  :max-iter (default 200)\n\nReturns: a hash-map containing the following fields:\n  :method -- the method used\n  :coefs  -- the parameter estimates\n  :gradient  -- the estimated gradient\n  :hessian -- the estimated hessian, if available\n  :iterations -- the number of iterations performed\n  :fitted -- the fitted values of y (i.e. y-hat)\n  :rss -- the residual sum-of-squares\n  :x -- the independent data values\n  :y -- the dependent data values\n\n\nExamples:\n\n  ;; example 1\n  (use '(incanter core optimize datasets charts))\n  ;; define the Michaelis-Menton model function\n  ;; y = a + (b - a)*x/(c + x)\n  (defn f [theta x]\n    (let [[a b c] theta]\n      (plus a (div (mult x (minus b a)) (plus c x)))))\n\n  (def start [20 200 100])\n  (def data (to-matrix (get-dataset :thurstone)))\n  (def x (sel data :cols 1))\n  (def y (sel data :cols 0))\n  ;; view the data\n  (def plot (scatter-plot x y))\n  (view plot)\n\n  (def nlm (non-linear-model f y x start))\n  (add-lines plot x (:fitted nlm))\n\n\n  ;; example 2\n  (use '(incanter core optimize datasets charts))\n  ;; Chwirut data set from NIST\n  ;; http://www.itl.nist.gov/div898/strd/nls/data/LINKS/DATA/Chwirut1.dat\n  (def data (to-matrix (get-dataset :chwirut)))\n  (def x (sel data :cols 1))\n  (def y (sel data :cols 0))\n\n  ;; define model function: y = exp(-b1*x)/(b2+b3*x) + e\n  (defn f [theta x]\n    (let [[b1 b2 b3] theta]\n      (div (exp (mult (minus b1) x)) (plus b2 (mult b3 x)))))\n\n  (def plot (scatter-plot x y :legend true))\n  (view plot)\n\n  ;; the newton-raphson algorithm fails to converge to the correct solution\n  ;; using first set of start values from NIST, but the default gauss-newton\n  ;; algorith converges to the correct solution.\n\n  (def start1 [0.1 0.01 0.02])\n  (add-lines plot x (f start1 x))\n  (def nlm1 (non-linear-model f y x start1))\n  (add-lines plot x (:fitted nlm1))\n\n  ;; both algorithms converges with second set of start values from NIST\n  (def start2 [0.15 0.008 0.010])\n  (add-lines plot x (f start2 x))\n  (def nlm2 (non-linear-model f y x start2))\n  (add-lines plot x (:fitted nlm2))",
   :name "non-linear-model"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L39",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/+cond-prob-tuples",
   :namespace "incanter.probability",
   :line 39,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([[x y] [p q]] [x]),
   :doc
   "adds two conditional probability tuples. [[{}{}][{}{}]] -> [{}{}]\npasses through a single conditional probability tuple. [[{}{}] -> [{}{}]",
   :name "+cond-prob-tuples"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L194",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/P",
   :namespace "incanter.probability",
   :line 194,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([a given b & bs] [a given b]),
   :doc "",
   :name "P"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L11",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/binary",
   :namespace "incanter.probability",
   :line 11,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([pred]),
   :doc
   "\na function for binary classification that takes a booleavn value and returns 1 for true and 0 for false.",
   :name "binary"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L48",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/comb-merge",
   :namespace "incanter.probability",
   :line 48,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([f x y]),
   :doc
   "combinatorial merge takes two maps and a fn and and merges all combinations fo keys between the two maps using the fn.\n",
   :name "comb-merge"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L165",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/cond-prob-tuple",
   :namespace "incanter.probability",
   :line 165,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "build [a&b b] count tuples for calculating conditional probabilities p(a | b)",
   :name "cond-prob-tuple"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L17",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/count-missing",
   :namespace "incanter.probability",
   :line 17,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([exp act]),
   :doc "set based counting for keys in maps",
   :name "count-missing"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L27",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/map-counter",
   :namespace "incanter.probability",
   :line 27,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "\nwraps a counting function for maps in apply and deep-merge-with, curreid fn expects a seq of maps to count.",
   :name "map-counter"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L72",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/marginals",
   :namespace "incanter.probability",
   :line 72,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([j]),
   :doc
   "\ncomputes the marginal PMFs from the joint PMF.\n\nof the form:   {a {b n}} where n is the nubmer of co-occurances of a and b.\n\nfor summation note that a variable, suppose it is x, is represented as a level of depth in the nested maps, so summation for margianl of x occurs on all branches stemming from maps at the level corresponding with x. ",
   :name "marginals"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L128",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/range-classifier",
   :namespace "incanter.probability",
   :line 128,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([range item]),
   :doc
   "\nclassify one item based on what interval in a range the item falls into.",
   :name "range-classifier"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L57",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/summate",
   :namespace "incanter.probability",
   :line 57,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([m]),
   :doc "summate all counts in a deeply nested map of counts.",
   :name "summate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L66",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/summate-level",
   :namespace "incanter.probability",
   :line 66,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([j]),
   :doc
   "given a nested map, summates all counts below the tree from each key-node in the map-tree.",
   :name "summate-level"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L33",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/vector-counter",
   :namespace "incanter.probability",
   :line 33,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([f]),
   :doc
   "\nwraps a counting function for vectors in apply and deep-merge-with, curreid fn expects a seq of vectors to count.",
   :name "vector-counter"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L179",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/|",
   :namespace "incanter.probability",
   :line 179,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "this is the core of the conditional probability based classification model.  this model takes a & bs in the form a given bs.  a and bs are all functions, and the conditional probability classification model composes a new classifier function that ultimately returns the cond-prob-tuple: [{a's counts}{b's counts}].",
   :name "|"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/probability.clj#L187",
   :wiki-url
   "http://liebke.github.com/incanter//probability-api.html#incanter.probability/|each",
   :namespace "incanter.probability",
   :line 187,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/probability.clj",
   :var-type "function",
   :arglists ([a bs]),
   :doc
   "conditional probability where the bs are taken to be a map of feature->classifier-function paris, where we want to compute the conditional probability between a and each b independently.",
   :name "|each"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L36",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/alpha",
   :namespace "incanter.processing",
   :line 36,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "alpha"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L52",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/ambient",
   :namespace "incanter.processing",
   :line 52,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch rgb]),
   :doc "",
   :name "ambient"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L64",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/ambient-light",
   :namespace "incanter.processing",
   :line 64,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch red green blue] [sketch red green blue x y z]),
   :doc "",
   :name "ambient-light"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L73",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/apply-matrix",
   :namespace "incanter.processing",
   :line 73,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch n00 n01 n02 n10 n11 n12]
    [sketch
     n00
     n01
     n02
     n03
     n10
     n11
     n12
     n13
     n20
     n21
     n22
     n23
     n30
     n31
     n32
     n33]),
   :doc "",
   :name "apply-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L87",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/arc",
   :namespace "incanter.processing",
   :line 87,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch a b c d start stop]),
   :doc "",
   :name "arc"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L112",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/background",
   :namespace "incanter.processing",
   :line 112,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch gray] [sketch gray alpha] [sketch r g b] [sketch r g b a]),
   :doc
   "\nExamples:\n\n  (use 'incanter.processing)\n  (def sktch (sketch))\n\n  (background sktch (color 255 0 255))\n  (draw sktch)\n\n  (background sktch (color 255 0 255 255)) ;; with alpha value\n  (draw sktch)\n\n  (background sktch (color \"0xFF00FF\"))\n  (draw sktch)\n\n  (background sktch (color 0xFF00FF))\n  (draw sktch)\n\n  (background sktch (color -65281))\n  (draw sktch)\n\n  (background sktch (color 0xFFFF00FF true)) ;; with alpha? true\n  (draw sktch)\n\n  (background sktch (color 0xFF 0x00 0xFF))\n  (draw sktch)\n\n  (background sktch (color 0xFF 0x00 0xFF 0xFF)) ;; with alpha value\n  (draw sktch)\n\n  (background sktch (color 1.0 0.0 1.0))\n  (draw sktch)\n\n  (background sktch (color 1.0 0.0 1.0 1.0)) ;; with alpha value\n  (draw sktch)",
   :name "background"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L198",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/background-image",
   :namespace "incanter.processing",
   :line 198,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch img]),
   :doc "",
   :name "background-image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L202",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/begin-camera",
   :namespace "incanter.processing",
   :line 202,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "begin-camera"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L206",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/begin-raw",
   :namespace "incanter.processing",
   :line 206,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch rawGfx] [sketch renderer filename]),
   :doc "",
   :name "begin-raw"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L214",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/begin-shape",
   :namespace "incanter.processing",
   :line 214,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch kind]),
   :doc "",
   :name "begin-shape"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L219",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/bezier",
   :namespace "incanter.processing",
   :line 219,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch x1 y1 x2 y2 x3 y3 x4 y4]
    [sketch x1 y1 z1 x2 y2 z2 x3 y3 z3 x4 y4 z4]),
   :doc "",
   :name "bezier"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L234",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/bezier-detail",
   :namespace "incanter.processing",
   :line 234,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch detail]),
   :doc "",
   :name "bezier-detail"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L239",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/bezier-point",
   :namespace "incanter.processing",
   :line 239,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch a b c d t]),
   :doc "",
   :name "bezier-point"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L244",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/bezier-tangent",
   :namespace "incanter.processing",
   :line 244,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch a b c d t]),
   :doc "",
   :name "bezier-tangent"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L249",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/bezier-vertex",
   :namespace "incanter.processing",
   :line 249,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch x2 y2 x3 y3 x4 y4]
    [sketch x1 y1 z1 x2 y2 z2 x3 y3 z3 x4 y4 z4]),
   :doc "",
   :name "bezier-vertex"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L264",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/blend",
   :namespace "incanter.processing",
   :line 264,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch sx1 sy1 sx2 sy2 dx1 dy1 dx2 dy2 mode]
    [sketch src sx1 sy1 sx2 sy2 dx1 dy1 dx2 dy2 mode]),
   :doc "",
   :name "blend"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L275",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/blend-color",
   :namespace "incanter.processing",
   :line 275,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([c1 c2 mode]),
   :doc "",
   :name "blend-color"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L280",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/blue",
   :namespace "incanter.processing",
   :line 280,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "blue"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L285",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/box",
   :namespace "incanter.processing",
   :line 285,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch size] [sketch w h d]),
   :doc "",
   :name "box"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L290",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/brightness",
   :namespace "incanter.processing",
   :line 290,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "brightness"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L294",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/camera",
   :namespace "incanter.processing",
   :line 294,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch]
    [sketch eyeX eyeY eyeZ centerX centerY centerZ upX upY upZ]),
   :doc "",
   :name "camera"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L300",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/can-draw?",
   :namespace "incanter.processing",
   :line 300,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "can-draw?"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L304",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/ceil",
   :namespace "incanter.processing",
   :line 304,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([n]),
   :doc "",
   :name "ceil"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1350",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/char->text",
   :namespace "incanter.processing",
   :line 1350,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch c] [sketch c x y] [sketch c x y z]),
   :doc "",
   :name "char->text"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L322",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/color",
   :namespace "incanter.processing",
   :line 322,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([rgb] [rgb alpha?] [x y z] [x y z alpha]),
   :doc
   "\n\nExamples:\n\n  (use 'incanter.processing)\n  (color 255 0 255)\n  (color 255 0 255 255) ;; with alpha value\n  (color \"0xFF00FF\")\n  (color 0xFF00FF)\n  (color -65281)\n  (color 0xFFFF00FF true) ;; with alpha? true\n  (color 0xFF 0x00 0xFF)\n  (color 0xFF 0x00 0xFF 0xFF) ;; with alpha value\n  (color 1.0 0.0 1.0)\n  (color 1.0 0.0 1.0 1.0) ;; with alpha value",
   :name "color"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L409",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/color-mode",
   :namespace "incanter.processing",
   :line 409,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch mode]
    [sketch mode max]
    [sketch mode max-x max-y max-z]
    [sketch mode max-x max-y max-z max-a]),
   :doc "",
   :name "color-mode"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L423",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/constrain",
   :namespace "incanter.processing",
   :line 423,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([amt low high]),
   :doc "",
   :name "constrain"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L438",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/copy-pixels",
   :namespace "incanter.processing",
   :line 438,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch [sx1 sy1 sx2 sy2] [dx1 dy1 dx2 dy2]]
    [sketch img [sx1 sy1 sx2 sy2] [dx1 dy1 dx2 dy2]]),
   :doc " Processing copy function. ",
   :name "copy-pixels"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L449",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-font",
   :namespace "incanter.processing",
   :line 449,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch name size]
    [sketch name size smooth]
    [sketch name size smooth charset]),
   :doc "",
   :name "create-font"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L505",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-graphics",
   :namespace "incanter.processing",
   :line 505,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch w h renderer] [sketch w h renderer path]),
   :doc "",
   :name "create-graphics"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L512",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-image",
   :namespace "incanter.processing",
   :line 512,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch w h format]),
   :doc "",
   :name "create-image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L516",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-input",
   :namespace "incanter.processing",
   :line 516,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([filename]),
   :doc "",
   :name "create-input"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L521",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-input-raw",
   :namespace "incanter.processing",
   :line 521,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "Call openStream() without automatic gzip decompression.",
   :name "create-input-raw"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L526",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-output",
   :namespace "incanter.processing",
   :line 526,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([filename]),
   :doc "",
   :name "create-output"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L531",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-path",
   :namespace "incanter.processing",
   :line 531,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([filename]),
   :doc "",
   :name "create-path"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L535",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-reader",
   :namespace "incanter.processing",
   :line 535,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "",
   :name "create-reader"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L539",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/create-writer",
   :namespace "incanter.processing",
   :line 539,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "",
   :name "create-writer"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L543",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/cursor",
   :namespace "incanter.processing",
   :line 543,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch cur-type]),
   :doc "",
   :name "cursor"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L548",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/cursor-image",
   :namespace "incanter.processing",
   :line 548,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch img] [sketch img hx hy]),
   :doc "",
   :name "cursor-image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L553",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/curve",
   :namespace "incanter.processing",
   :line 553,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch x1 y1 x2 y2 x3 y3 x4 y4]
    [sketch x1 y1 z1 x2 y2 z2 x3 y3 z3 x4 y4 z4]),
   :doc "",
   :name "curve"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L568",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/curve-detail",
   :namespace "incanter.processing",
   :line 568,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch detail]),
   :doc "",
   :name "curve-detail"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L573",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/curve-point",
   :namespace "incanter.processing",
   :line 573,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch a b c d t]),
   :doc "",
   :name "curve-point"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L578",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/curve-tangent",
   :namespace "incanter.processing",
   :line 578,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch a b c d t]),
   :doc "",
   :name "curve-tangent"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L583",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/curve-tightness",
   :namespace "incanter.processing",
   :line 583,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch ti]),
   :doc "",
   :name "curve-tightness"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L587",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/curve-vertex",
   :namespace "incanter.processing",
   :line 587,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y] [sketch x y z]),
   :doc "",
   :name "curve-vertex"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L595",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/day",
   :namespace "incanter.processing",
   :line 595,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Get the current day of the month (1 through 31).",
   :name "day"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L600",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/degrees",
   :namespace "incanter.processing",
   :line 600,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([radians]),
   :doc "",
   :name "degrees"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L604",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/delay-frame",
   :namespace "incanter.processing",
   :line 604,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch nap-time]),
   :doc "",
   :name "delay-frame"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L608",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/destroy",
   :namespace "incanter.processing",
   :line 608,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "destroy"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L614",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/directional-light",
   :namespace "incanter.processing",
   :line 614,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch r g b nx ny nz]),
   :doc "",
   :name "directional-light"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L619",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/displayable?",
   :namespace "incanter.processing",
   :line 619,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "displayable?"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L623",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/dist",
   :namespace "incanter.processing",
   :line 623,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([a b x y] [a b c x y z]),
   :doc "",
   :name "dist"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L630",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/ellipse",
   :namespace "incanter.processing",
   :line 630,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch a b c d]),
   :doc "",
   :name "ellipse"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L635",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/ellipse-mode",
   :namespace "incanter.processing",
   :line 635,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch mode]),
   :doc "",
   :name "ellipse-mode"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L641",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/emissive",
   :namespace "incanter.processing",
   :line 641,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch gray] [sketch x y z]),
   :doc "",
   :name "emissive"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L653",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/end-camera",
   :namespace "incanter.processing",
   :line 653,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "end-camera"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L657",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/end-raw",
   :namespace "incanter.processing",
   :line 657,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "end-raw"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L661",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/end-shape",
   :namespace "incanter.processing",
   :line 661,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch mode]),
   :doc "",
   :name "end-shape"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L668",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/exit",
   :namespace "incanter.processing",
   :line 668,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "exit"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L470",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/export-font",
   :namespace "incanter.processing",
   :line 470,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([font-name size smooth filename] [font-name size filename]),
   :doc
   " Exports the given system font to a vlw file.\n\nExamples:\n\n  (use '(incanter core processing))\n  (export-font \"Ariel\" 48 \"/tmp/ariel_48.vlw\")\n\n  (view\n    (sketch\n      (setup []\n        (let [font (load-font this \"/tmp/ariel_48.vlw\")]\n          (doto this\n            (text-font font)\n            smooth\n            (fill 0))))\n\n          (draw []\n            (doto this\n              (text \"LAX\" 0 40)\n              (text \"AMS\" 0 70)\n              (text \"FRA\" 0 100))))\n    :size [120 120])",
   :name "export-font"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L678",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/fill",
   :namespace "incanter.processing",
   :line 678,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch gray]
    [sketch gray alpha]
    [sketch x y z]
    [sketch x y z alpha]),
   :doc
   "\nSets the color used to fill shapes. For example, if you run (fill 204 102 0), all\nsubsequent shapes will be filled with orange. This color is either specified in\nterms of the RGB or HSB color depending on the current colorMode() (the default\ncolor space is RGB, with each value in the range from 0 to 255).\n\nWhen using hexadecimal notation to specify a color, use '16r' before\nthe values (e.g. 16rCCFFAA, 16rFFCCFFAA). Use six digits to specify\na color (the way colors are specified in HTML and CSS). When eight\ndigits are used, the first two characters define the alpha component and the\nremainder the red, green, and blue components.\n\nThe value for the parameter \"gray\" must be less than or equal to the current\nmaximum value as specified by (colorMode). The default maximum value is 255.\n\nTo change the color of an image (or a texture), use (tint).\n\n\n\nSyntax:\n  (fill sketch gray)\n  (fill sketch gray alpha)\n  (fill sketch value1 value2 value3)\n  (fill sketch value1 value2 value3 alpha)\n  (fill sketch color)\n  (fill sketch color alpha)\n  (fill sketch hex)\n  (fill sketch hex alpha)\n\n\nParameters:\n  sketch    PApplet\n  gray      int or float: number specifying value between white and black\n  alpha     int or float: opacity of the fill\n  value1    int or float: red or hue value\n  value2    int or float: green or saturation value\n  value3    int or float: blue or brightness value\n  color     color: any value of the color datatype\n  hex int:  color value in hexadecimal notation (i.e. #FFCC00 or 0xFFFFCC00)\n\nReturns:\n  None\n\nReferences:\n  http://processing.org/reference/fill_.html\n\n\nExamples:\n\n  (def sktch (sketch))\n  (fill sktch \"0xFF00FF\")\n  (fill sktch 0xFF 0x00 0xFF)\n  (fill sktch 255 0 255)",
   :name "fill"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L764",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/filter-kind",
   :namespace "incanter.processing",
   :line 764,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch kind] [sketch kind param]),
   :doc "",
   :name "filter-kind"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L778",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/frame-count",
   :namespace "incanter.processing",
   :line 778,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "frame-count"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L772",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/framerate",
   :namespace "incanter.processing",
   :line 772,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch new-rate]),
   :doc "",
   :name "framerate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L783",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/frustum",
   :namespace "incanter.processing",
   :line 783,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch l r b t near far]),
   :doc "",
   :name "frustum"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L788",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/get-pixel",
   :namespace "incanter.processing",
   :line 788,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch x y] [sketch x y w h]),
   :doc "",
   :name "get-pixel"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L794",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/green",
   :namespace "incanter.processing",
   :line 794,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "green"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1490",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/height",
   :namespace "incanter.processing",
   :line 1490,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "height"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L801",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/hint",
   :namespace "incanter.processing",
   :line 801,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch which]),
   :doc "",
   :name "hint"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L805",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/hour",
   :namespace "incanter.processing",
   :line 805,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "",
   :name "hour"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L809",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/hue",
   :namespace "incanter.processing",
   :line 809,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "hue"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L813",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/image",
   :namespace "incanter.processing",
   :line 813,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch img x y]
    [sketch img x y c d]
    [sketch img x y c d u1 v1 u2 v2]),
   :doc "",
   :name "image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L819",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/image-mode",
   :namespace "incanter.processing",
   :line 819,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch mode]),
   :doc "",
   :name "image-mode"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L835",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/lerp-color",
   :namespace "incanter.processing",
   :line 835,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([c1 c2 amt]),
   :doc
   "\n Calculates a color or colors between two color at a specific increment.\n The amt parameter is the amount to interpolate between the two values\n where 0.0 equal to the first point, 0.1 is very near the first point\n 0.5 is half-way in between, etc.\n\n Parameters:\n   c1  color: interpolate from this color\n   c2  color: interpolate to this color\n   amt float: between 0.0 and 1.0\n\n Returns:\n   float\n\n",
   :name "lerp-color"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L859",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/light-specular",
   :namespace "incanter.processing",
   :line 859,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y z]),
   :doc "",
   :name "light-specular"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L855",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/lights",
   :namespace "incanter.processing",
   :line 855,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "lights"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L864",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/line",
   :namespace "incanter.processing",
   :line 864,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch p1 p2] [sketch x1 y1 x2 y2] [sketch x1 y1 z1 x2 y2 z2]),
   :doc "",
   :name "line"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L458",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/list-fonts",
   :namespace "incanter.processing",
   :line 458,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "Returns a list of the fonts available on current system.",
   :name "list-fonts"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L872",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-bytes",
   :namespace "incanter.processing",
   :line 872,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([filename]),
   :doc "",
   :name "load-bytes"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L876",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-font",
   :namespace "incanter.processing",
   :line 876,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "",
   :name "load-font"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L880",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-image",
   :namespace "incanter.processing",
   :line 880,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "",
   :name "load-image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L884",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-matrix",
   :namespace "incanter.processing",
   :line 884,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "load-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L888",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-pixels",
   :namespace "incanter.processing",
   :line 888,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "load-pixels"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L892",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-shape",
   :namespace "incanter.processing",
   :line 892,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "Load a geometry from a file as a PShape.",
   :name "load-shape"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L897",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/load-strings",
   :namespace "incanter.processing",
   :line 897,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename]),
   :doc "Load data from a file and shove it into a String array.",
   :name "load-strings"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L917",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/mask",
   :namespace "incanter.processing",
   :line 917,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch alpha-array]),
   :doc "",
   :name "mask"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L921",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/mask-image",
   :namespace "incanter.processing",
   :line 921,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch img]),
   :doc "",
   :name "mask-image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L928",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/millis",
   :namespace "incanter.processing",
   :line 928,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "millis"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L934",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/minute",
   :namespace "incanter.processing",
   :line 934,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "",
   :name "minute"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L938",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/model-x",
   :namespace "incanter.processing",
   :line 938,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y z]),
   :doc "",
   :name "model-x"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L942",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/model-y",
   :namespace "incanter.processing",
   :line 942,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y z]),
   :doc "",
   :name "model-y"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L946",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/model-z",
   :namespace "incanter.processing",
   :line 946,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y z]),
   :doc "",
   :name "model-z"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L950",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/month",
   :namespace "incanter.processing",
   :line 950,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "",
   :name "month"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L966",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/mouse-x",
   :namespace "incanter.processing",
   :line 966,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([mouse-event]),
   :doc "",
   :name "mouse-x"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L971",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/mouse-y",
   :namespace "incanter.processing",
   :line 971,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([mouse-event]),
   :doc "",
   :name "mouse-y"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L975",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-cursor",
   :namespace "incanter.processing",
   :line 975,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-cursor"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L979",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-fill",
   :namespace "incanter.processing",
   :line 979,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-fill"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L998",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-lights",
   :namespace "incanter.processing",
   :line 998,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-lights"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1002",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-loop",
   :namespace "incanter.processing",
   :line 1002,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-loop"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1015",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-smooth",
   :namespace "incanter.processing",
   :line 1015,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-smooth"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1019",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-stroke",
   :namespace "incanter.processing",
   :line 1019,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-stroke"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1023",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/no-tint",
   :namespace "incanter.processing",
   :line 1023,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "no-tint"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L983",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/noise",
   :namespace "incanter.processing",
   :line 983,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x] [sketch x y] [sketch x y z]),
   :doc "",
   :name "noise"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L989",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/noise-detail",
   :namespace "incanter.processing",
   :line 989,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch int detail] [sketch int detail falloff]),
   :doc "",
   :name "noise-detail"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L994",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/noise-seed",
   :namespace "incanter.processing",
   :line 994,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "noise-seed"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1006",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/norm",
   :namespace "incanter.processing",
   :line 1006,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([val start stop]),
   :doc "Normalize a value to exist between 0 and 1 (inclusive).",
   :name "norm"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1011",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/normal",
   :namespace "incanter.processing",
   :line 1011,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch nx ny nz]),
   :doc "",
   :name "normal"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1356",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/num->text",
   :namespace "incanter.processing",
   :line 1356,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch num x y] [sketch num x y z]),
   :doc "",
   :name "num->text"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1027",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/open",
   :namespace "incanter.processing",
   :line 1027,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([filename]),
   :doc "",
   :name "open"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1033",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/ortho",
   :namespace "incanter.processing",
   :line 1033,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch l r b t near far]),
   :doc "",
   :name "ortho"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1046",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/perspective",
   :namespace "incanter.processing",
   :line 1046,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch fovy aspect z-near z-far]),
   :doc "",
   :name "perspective"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1058",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/point",
   :namespace "incanter.processing",
   :line 1058,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y] [sketch x y z]),
   :doc "",
   :name "point"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1063",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/point-light",
   :namespace "incanter.processing",
   :line 1063,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch r g b x y z]),
   :doc "",
   :name "point-light"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1068",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/pop-matrix",
   :namespace "incanter.processing",
   :line 1068,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "pop-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1076",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/print-camera",
   :namespace "incanter.processing",
   :line 1076,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "print-camera"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1082",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/print-matrix",
   :namespace "incanter.processing",
   :line 1082,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "print-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1086",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/print-projection",
   :namespace "incanter.processing",
   :line 1086,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "print-projection"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1090",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/push-matrix",
   :namespace "incanter.processing",
   :line 1090,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "push-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1094",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/quad",
   :namespace "incanter.processing",
   :line 1094,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x1 y1 x2 y2 x3 y3 x4 y4]),
   :doc "",
   :name "quad"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1099",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/radians",
   :namespace "incanter.processing",
   :line 1099,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([deg]),
   :doc "",
   :name "radians"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1110",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/rect",
   :namespace "incanter.processing",
   :line 1110,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x1 y1 x2 y2]),
   :doc "",
   :name "rect"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1115",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/rect-mode",
   :namespace "incanter.processing",
   :line 1115,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch mode]),
   :doc "",
   :name "rect-mode"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1119",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/red",
   :namespace "incanter.processing",
   :line 1119,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "red"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1123",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/redraw",
   :namespace "incanter.processing",
   :line 1123,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "redraw"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L912",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/remap",
   :namespace "incanter.processing",
   :line 912,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([val istart istop ostart ostop]),
   :doc "",
   :name "remap"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1136",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/request-image",
   :namespace "incanter.processing",
   :line 1136,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch filename] [sketch filename extension]),
   :doc "",
   :name "request-image"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1141",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/reset-matrix",
   :namespace "incanter.processing",
   :line 1141,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "reset-matrix"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1145",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/reverse-array",
   :namespace "incanter.processing",
   :line 1145,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([arr]),
   :doc "",
   :name "reverse-array"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1149",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/rotate",
   :namespace "incanter.processing",
   :line 1149,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch angle] [sketch angle vx vy vz]),
   :doc "",
   :name "rotate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1154",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/rotate-x",
   :namespace "incanter.processing",
   :line 1154,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch angle]),
   :doc "",
   :name "rotate-x"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1158",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/rotate-y",
   :namespace "incanter.processing",
   :line 1158,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch angle]),
   :doc "",
   :name "rotate-y"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1162",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/rotate-z",
   :namespace "incanter.processing",
   :line 1162,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch angle]),
   :doc "",
   :name "rotate-z"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1166",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/round",
   :namespace "incanter.processing",
   :line 1166,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([what]),
   :doc "",
   :name "round"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1172",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/saturation",
   :namespace "incanter.processing",
   :line 1172,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch what]),
   :doc "",
   :name "saturation"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L463",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/save-font",
   :namespace "incanter.processing",
   :line 463,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch font filename]),
   :doc "",
   :name "save-font"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1187",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/save-frame",
   :namespace "incanter.processing",
   :line 1187,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch] [sketch what]),
   :doc "",
   :name "save-frame"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1196",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/scale",
   :namespace "incanter.processing",
   :line 1196,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch s] [sketch sx sy]),
   :doc "",
   :name "scale"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1201",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/screen-x",
   :namespace "incanter.processing",
   :line 1201,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y] [sketch x y y]),
   :doc "",
   :name "screen-x"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1206",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/screen-y",
   :namespace "incanter.processing",
   :line 1206,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y] [sketch x y z]),
   :doc "",
   :name "screen-y"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1211",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/screen-z",
   :namespace "incanter.processing",
   :line 1211,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y z]),
   :doc "",
   :name "screen-z"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1215",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/seconds",
   :namespace "incanter.processing",
   :line 1215,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "",
   :name "seconds"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1227",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/set-image-at",
   :namespace "incanter.processing",
   :line 1227,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch dx dy src]),
   :doc "",
   :name "set-image-at"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1223",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/set-pixel",
   :namespace "incanter.processing",
   :line 1223,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x y c]),
   :doc "",
   :name "set-pixel"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1236",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/shininess",
   :namespace "incanter.processing",
   :line 1236,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch shine]),
   :doc "",
   :name "shininess"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1244",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/size",
   :namespace "incanter.processing",
   :line 1244,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch w h] [sketch w h renderer]),
   :doc "",
   :name "size"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1252",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/smooth",
   :namespace "incanter.processing",
   :line 1252,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "smooth"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1258",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/specular",
   :namespace "incanter.processing",
   :line 1258,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch gray] [sketch gray alpha] [sketch x y z] [sketch x y z a]),
   :doc "",
   :name "specular"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1265",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/sphere",
   :namespace "incanter.processing",
   :line 1265,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch r]),
   :doc "",
   :name "sphere"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1269",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/sphere-detail",
   :namespace "incanter.processing",
   :line 1269,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch res] [sketch ures vres]),
   :doc "",
   :name "sphere-detail"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1278",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/spotlight",
   :namespace "incanter.processing",
   :line 1278,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch r g b x y z nx ny nz angle concentration]
    [sketch [r g b] [x y z] [nx ny nz] angle concentration]),
   :doc "",
   :name "spotlight"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L904",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/start-loop",
   :namespace "incanter.processing",
   :line 904,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "start-loop"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1361",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/string->text",
   :namespace "incanter.processing",
   :line 1361,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch s] [sketch s x y] [sketch s x y z]),
   :doc "",
   :name "string->text"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1367",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/string->text-in",
   :namespace "incanter.processing",
   :line 1367,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch s x1 y1 x2 y2] [sketch s x1 y1 x2 y2 z]),
   :doc "",
   :name "string->text-in"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1295",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/stroke",
   :namespace "incanter.processing",
   :line 1295,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch gray]
    [sketch gray alpha]
    [sketch x y z]
    [sketch x y z alpha]),
   :doc "",
   :name "stroke"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1319",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/stroke-cap",
   :namespace "incanter.processing",
   :line 1319,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch cap]),
   :doc "",
   :name "stroke-cap"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1323",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/stroke-join",
   :namespace "incanter.processing",
   :line 1323,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch jn]),
   :doc "",
   :name "stroke-join"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1327",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/stroke-weight",
   :namespace "incanter.processing",
   :line 1327,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch weight]),
   :doc "",
   :name "stroke-weight"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1336",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text",
   :namespace "incanter.processing",
   :line 1336,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch s]
    [sketch s x y]
    [sketch s x y z]
    [sketch s x1 y1 x2 y2]
    [sketch s x1 y1 x2 y2 z]),
   :doc "",
   :name "text"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1374",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-align",
   :namespace "incanter.processing",
   :line 1374,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch align] [sketch align-x align-y]),
   :doc "",
   :name "text-align"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1379",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-ascent",
   :namespace "incanter.processing",
   :line 1379,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "text-ascent"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1383",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-descend",
   :namespace "incanter.processing",
   :line 1383,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "text-descend"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1387",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-font",
   :namespace "incanter.processing",
   :line 1387,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch which] [sketch which size]),
   :doc "",
   :name "text-font"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1392",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-leading",
   :namespace "incanter.processing",
   :line 1392,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch leading]),
   :doc "",
   :name "text-leading"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1396",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-mode",
   :namespace "incanter.processing",
   :line 1396,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch mode]),
   :doc "",
   :name "text-mode"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1400",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-size",
   :namespace "incanter.processing",
   :line 1400,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch size]),
   :doc "",
   :name "text-size"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1412",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/text-width",
   :namespace "incanter.processing",
   :line 1412,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "multimethod",
   :doc "",
   :name "text-width"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1404",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/texture",
   :namespace "incanter.processing",
   :line 1404,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch img]),
   :doc "",
   :name "texture"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1408",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/texture-mode",
   :namespace "incanter.processing",
   :line 1408,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch mode]),
   :doc "",
   :name "texture-mode"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1423",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/tint",
   :namespace "incanter.processing",
   :line 1423,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch gray] [sketch gray alpha] [sketch x y z] [sketch x y z a]),
   :doc "",
   :name "tint"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1451",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/translate",
   :namespace "incanter.processing",
   :line 1451,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([v] [sketch tx ty] [sketch tx ty tz]),
   :doc "",
   :name "translate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1457",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/triangle",
   :namespace "incanter.processing",
   :line 1457,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch x1 y1 x2 y2 x3 y3]),
   :doc "",
   :name "triangle"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1477",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/vertex",
   :namespace "incanter.processing",
   :line 1477,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists
   ([sketch x y] [sketch x y z] [sketch x y u v] [sketch x y z u v]),
   :doc "",
   :name "vertex"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1486",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/width",
   :namespace "incanter.processing",
   :line 1486,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([sketch]),
   :doc "",
   :name "width"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1510",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/with-rotation",
   :namespace "incanter.processing",
   :line 1510,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "macro",
   :arglists ([rotation & body]),
   :doc
   "Berforms body with rotation, restores current transformation on exit.\nAccepts a vector [angle] or [angle x-axis y-axis z-axis].\n\nExample:\n  (with-rotation [angle]\n    (vertex 1 2))",
   :name "with-rotation"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1501",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/with-translation",
   :namespace "incanter.processing",
   :line 1501,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "macro",
   :arglists ([translation-vector & body]),
   :doc
   "Berforms body with translation, restores current transformation on exit.",
   :name "with-translation"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a47ff703a16cea11308f8ed6bd582d1b659a3e5c/modules/incanter-processing/src/main/clojure/incanter/processing.clj#L1495",
   :wiki-url
   "http://liebke.github.com/incanter//processing-api.html#incanter.processing/year",
   :namespace "incanter.processing",
   :line 1495,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-processing/src/main/clojure/incanter/processing.clj",
   :var-type "function",
   :arglists ([]),
   :doc "",
   :name "year"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/som.clj#L137",
   :wiki-url
   "http://liebke.github.com/incanter//som-api.html#incanter.som/som-batch-train",
   :namespace "incanter.som",
   :line 137,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/som.clj",
   :var-type "function",
   :arglists ([data & options]),
   :doc
   " Performs BL-SOM (batch-learning self organizing map) learning on\nthe given data, returning a hashmap containing resulting BL-SOM\nvalues.\n\n\nArguments:\n  data -- data matrix\n\nOptions:\n  :cycles -- number of cycles of learning\n  :alpha -- initial value of alpha learning parameter\n  :beta -- initial value of beta learning parameter\n\n\nReturns: A hashmap containing the following fields:\n\n  :fit -- array of fitness values for each cycle of SOM learning\n  :weights -- hashmap of weight vectors, keyed by lattice indices\n  :sets -- hashmap mapping data elements to lattice nodes\n           (key lattice index) (value list of row indices from data)\n  :dims -- dimensions of SOM lattice\n  :data-means -- column means of input data matrix\n\n\nExamples:\n\n  (use '(incanter core som stats charts datasets))\n  (def data (to-matrix (sel (get-dataset :iris)\n                         :cols [\"Sepal.Length\" \"Sepal.Width\" \"Petal.Length\" \"Petal.Width\"])))\n\n  (def som (som-batch-train data :cycles 10 :alpha 0.5 :beta 3))\n\n  ;; plot the fitness for each cycle of training\n  (view (xy-plot (range (count (:fit som))) (:fit som)))\n  ;; view indices of data items in each cell\n  (:sets som)\n  ;; view the species in each cell\n  (doseq [rws (vals (:sets som))]\n    (println (sel (get-dataset :iris) :cols \"Species\" :rows rws) \\newline))\n\n  ;; plot the means of the data vectors in each cell/cluster\n  (def cell-means (map #(map mean (trans (sel data :rows ((:sets som) %)))) (keys (:sets som))))\n  (def x (range (ncol data)))\n  (doto (xy-plot x (first cell-means))\n        view\n        (add-lines x (nth cell-means 1))\n        (add-lines x (nth cell-means 2)))\n\n\nReferences:\n\n  http://en.wikipedia.org/wiki/Self-organizing_map",
   :name "som-batch-train"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1638",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/bootstrap",
   :namespace "incanter.stats",
   :line 1638,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([data statistic & options]),
   :doc
   " Returns a bootstrap sample of the given statistic on the given data.\n\nArguments:\n  data -- vector of data to resample from\n  statistic -- a function that returns a value given a vector of data\n\nOptions:\n  :size -- the number of bootstrap samples to return\n  :smooth -- (default false) smoothing option\n  :smooth-sd -- (default (/ (sqrt (count data)))) determines the standard\n                deviation of the noise to use for smoothing\n  :replacement -- (default true) determines if sampling of the data\n                  should be done with replacement\n\n\nReferences:\n  1. Clifford E. Lunneborg, Data Analysis by Resampling Concepts and Applications, 2000, pages 105-117\n  2. http://en.wikipedia.org/wiki/Bootstrapping_(statistics)\n\n\nExamples:\n\n  ;; example from Data Analysis by Resampling Concepts and Applications\n  ;; Clifford E. Lunneborg (pages 119-122)\n\n  (use '(incanter core stats charts))\n\n  ;; weights (in grams) of 50 randoincanter. sampled bags of preztels\n  (def weights [464 447 446 454 450 457 450 442\n                433 452 449 454 450 438 448 449\n                457 451 456 452 450 463 464 453\n                452 447 439 449 468 443 433 460\n                452 447 447 446 450 459 466 433\n                445 453 454 446 464 450 456 456\n                447 469])\n\n  ;; calculate the sample median, 450\n  (median weights)\n\n  ;; generate bootstrap sample\n  (def t* (bootstrap weights median :size 2000))\n\n  ;; view histogram of bootstrap histogram\n  (view (histogram t*))\n\n  ;; calculate the mean of the bootstrap median ~ 450.644\n  (mean t*)\n\n  ;; calculate the standard error ~ 1.083\n  (def se (sd t*))\n\n  ;; 90% standard normal CI ~ (448.219 451.781)\n  (plus (median weights) (mult (quantile-normal [0.05 0.95]) se))\n\n  ;; 90% symmetric percentile CI ~ (449.0 452.5)\n  (quantile t* :probs [0.05 0.95])\n\n\n  ;; 90% non-symmetric percentile CI ~ (447.5 451.0)\n  (minus (* 2 (median weights)) (quantile t* :probs [0.95 0.05]))\n\n  ;; calculate bias\n  (- (mean t*) (median weights)) ;; ~ 0.644\n\n  ;; example with smoothing\n  ;; Newcomb's speed of light data\n\n  (use '(incanter core stats charts))\n\n  ;; A numeric vector giving the Third Series of measurements of the\n  ;; passage time of light recorded by Newcomb in 1882. The given\n  ;; values divided by 1000 plus 24 give the time in millionths of a\n  ;; second for light to traverse a known distance. The 'true' value is\n  ;; now considered to be 33.02.\n\n  (def speed-of-light [28 -44  29  30  24  28  37  32  36  27  26  28  29\n                       26  27  22  23  20  25 25  36  23  31  32  24  27\n                       33  16  24  29  36  21  28  26  27  27  32  25 28\n                       24  40  21  31  32  28  26  30  27  26  24  32  29\n                       34  -2  25  19  36 29  30  22  28  33  39  25  16  23])\n\n  ;; view histogram of data to see outlier observations\n  (view (histogram speed-of-light :nbins 30))\n\n  (def samp (bootstrap speed-of-light median :size 10000))\n  (view (histogram samp :density true :nbins 30))\n  (mean samp)\n  (quantile samp :probs [0.025 0.975])\n\n  (def smooth-samp (bootstrap speed-of-light median :size 10000 :smooth true))\n  (view (histogram smooth-samp :density true :nbins 30))\n  (mean smooth-samp)\n  (quantile smooth-samp :probs [0.025 0.975])",
   :name "bootstrap"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L480",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-beta",
   :namespace "incanter.stats",
   :line 480,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Beta cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's pbeta function.\n\nOptions:\n  :alpha (default 1)\n  :beta (default 1)\n  :lower-tail (default true)\n\nSee also:\n    pdf-beta and sample-beta\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Beta.html\n    http://en.wikipedia.org/wiki/Beta_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-beta 0.5 :alpha 1 :beta 2)\n    (cdf-beta 0.5 :alpha 1 :beta 2 :lower-tail false)",
   :name "cdf-beta"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1102",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-binomial",
   :namespace "incanter.stats",
   :line 1102,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Bionomial cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's pbinom\n\nOptions:\n  :size (default 1)\n  :prob (default 1/2)\n  :lower-tail (default true)\n\nSee also:\n    pdf-binomial and sample-binomial\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Binomial.html\n    http://en.wikipedia.org/wiki/Binomial_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-binomial 10 :prob 1/4 :size 20)",
   :name "cdf-binomial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L675",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-chisq",
   :namespace "incanter.stats",
   :line 675,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Chi Square cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's pchisq function.\n\nOptions:\n  :df (default 1)\n  :lower-tail (default true)\n\nSee also:\n    pdf-chisq and sample-chisq\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/ChiSquare.html\n    http://en.wikipedia.org/wiki/Chi_square_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-chisq 5.0 :df 2)\n    (cdf-chisq 5.0 :df 2 :lower-tail false)",
   :name "cdf-chisq"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1354",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-empirical",
   :namespace "incanter.stats",
   :line 1354,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   " Returns a step-function representing the empirical cdf of the given data.\nEquivalent to R's ecdf function.\n\nThe following description is from the ecdf help in R: The e.c.d.f.\n(empirical cumulative distribution function) Fn is a step function\nwith jumps i/n at observation values, where i is the number of tied\nobservations at that value.  Missing values are ignored.\n\nFor observations 'x'= (x1,x2, ... xn), Fn is the fraction of\nobservations less or equal to t, i.e.,\n\nFn(t) = #{x_i <= t} / n  =  1/n sum(i=1,n) Indicator(xi <= t).\n\n\nExamples:\n  (use '(incanter core stats charts))\n\n  (def exam1 [192 160 183 136 162 165 181 188 150 163 192 164 184\n              189 183 181 188 191 190 184 171 177 125 192 149 188\n              154 151 159 141 171 153 169 168 168 157 160 190 166 150])\n\n  ;; the ecdf function returns an empirical cdf function for the given data\n  (def ecdf (cdf-empirical exam1))\n\n  ;; plot the data's empircal cdf\n  (view (scatter-plot exam1 (map ecdf exam1)))",
   :name "cdf-empirical"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L894",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-exp",
   :namespace "incanter.stats",
   :line 894,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Exponential cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's pexp\n\nOptions:\n  :rate (default 1)\n\nSee also:\n    pdf-exp and sample-exp\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Exponential.html\n    http://en.wikipedia.org/wiki/Exponential_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-exp 2.0 :rate 1/2)",
   :name "cdf-exp"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L122",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-f",
   :namespace "incanter.stats",
   :line 122,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the F-distribution cdf of the given value, x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's pf function.\n\nOptions:\n  :df1 (default 1)\n  :df2 (default 1)\n\nSee also:\n    pdf-f and quantile-f\n\nReferences:\n    http://en.wikipedia.org/wiki/F_distribution\n    http://mathworld.wolfram.com/F-Distribution.html\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-f 1.0 :df1 5 :df2 2)",
   :name "cdf-f"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L579",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-gamma",
   :namespace "incanter.stats",
   :line 579,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Gamma cdf for the given value of x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's pgamma function.\n\nOptions:\n  :shape (default 1)\n  :rate (default 1)\n  :lower-tail (default true)\n\nSee also:\n    pdf-gamma and sample-gamma\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Gamma.html\n    http://en.wikipedia.org/wiki/Gamma_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-gamma 10 :shape 1 :rate 2)\n    (cdf-gamma 3 :shape 1 :lower-tail false)",
   :name "cdf-gamma"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1289",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-neg-binomial",
   :namespace "incanter.stats",
   :line 1289,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Negative Binomial cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's dnbinom\n\nOptions:\n  :size (default 10)\n  :prob (default 1/2)\n\nSee also:\n    cdf-neg-binomial and sample-neg-binomial\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/NegativeBinomial.html\n    http://en.wikipedia.org/wiki/Negative_binomial_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-neg-binomial 10 :prob 1/2 :size 20)",
   :name "cdf-neg-binomial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L196",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-normal",
   :namespace "incanter.stats",
   :line 196,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Normal cdf of the given value, x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's pnorm function.\n\nOptions:\n  :mean (default 0)\n  :sd (default 1)\n\nSee also:\n    pdf-normal, quantile-normal, sample-normal\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Normal.html\n    http://en.wikipedia.org/wiki/Normal_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-normal 1.96 :mean -2 :sd (sqrt 0.5))",
   :name "cdf-normal"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1196",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-poisson",
   :namespace "incanter.stats",
   :line 1196,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Poisson cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's ppois\n\nOptions:\n  :lambda (default 1)\n  :lower-tail (default true)\n\nSee also:\n    cdf-poisson and sample-poisson\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Poisson.html\n    http://en.wikipedia.org/wiki/Poisson_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-poisson 5 :lambda 10)",
   :name "cdf-poisson"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L765",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-t",
   :namespace "incanter.stats",
   :line 765,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Student's t cdf for the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's pt function.\n\nOptions:\n  :df (default 1)\n\nSee also:\n    pdf-t, quantile-t, and sample-t\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/StudentT.html\n    http://en.wikipedia.org/wiki/Student-t_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-t 1.2 :df 10)",
   :name "cdf-t"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L382",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cdf-uniform",
   :namespace "incanter.stats",
   :line 382,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Uniform cdf of the given value of x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's punif function.\n\nOptions:\n  :min (default 0)\n  :max (default 1)\n\nSee also:\n    pdf-uniform and sample-uniform\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/DoubleUniform.html\n    http://en.wikipedia.org/wiki/Uniform_distribution\n    http://en.wikipedia.org/wiki/Cumulative_distribution_function\n\nExample:\n    (cdf-uniform 5)\n    (cdf-uniform 5 :min 1 :max 10)",
   :name "cdf-uniform"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2883",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/chebyshev-distance",
   :namespace "incanter.stats",
   :line 2883,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "In the limiting case of Lp reaching infinity we obtain the Chebyshev distance.",
   :name "chebyshev-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2262",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/chisq-test",
   :namespace "incanter.stats",
   :line 2262,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   "\nPerforms chi-squared contingency table tests and goodness-of-fit tests.\n\nIf the optional argument :y is not provided then a goodness-of-fit test\nis performed. In this case, the hypothesis tested is whether the\npopulation probabilities equal those in :probs, or are all equal if\n:probs is not given.\n\nIf :y is provided, it must be a sequence of integers that is the\nsame length as x. A contingency table is computed from x and :y.\nThen, Pearson's chi-squared test of the null hypothesis that the joint\ndistribution of the cell counts in a 2-dimensional contingency\ntable is the product of the row and column marginals is performed.\nBy default the Yates' continuity correction for 2x2 contingency\ntables is performed, this can be disabled by setting the :correct\noption to false.\n\n\nOptions:\n  :x -- a sequence of numbers.\n  :y -- a sequence of numbers\n  :table -- a contigency table. If one dimensional, the test is a goodness-of-fit\n  :probs (when (nil? y) -- (repeat n-levels (/ n-levels)))\n  :freq (default nil) -- if given, these are rescaled to probabilities\n  :correct (default true) -- use Yates' correction for continuity for 2x2 contingency tables\n\n\nReturns:\n  :X-sq -- the Pearson X-squared test statistics\n  :p-value -- the p-value for the test statistic\n  :df -- the degress of freedom\n\n\nExamples:\n  (use '(incanter core stats))\n  (chisq-test :x [1 2 3 2 3 2 4 3 5]) ;; X-sq 2.6667\n  ;; create a one-dimensional table of this data\n  (def table (matrix [1 3 3 1 1]))\n  (chisq-test :table table) ;; X-sq 2.6667\n  (chisq-test :table (trans table)) ;; throws exception\n\n  (chisq-test :x [1 0 0 0  1 1 1 0 0 1 0 0 1 1 1 1]) ;; 0.25\n\n  (use '(incanter core stats datasets))\n  (def math-prog (to-matrix (get-dataset :math-prog)))\n  (def x (sel math-prog :cols 1))\n  (def y (sel math-prog :cols 2))\n  (chisq-test :x x :y y) ;; X-sq = 1.24145, df=1, p-value = 0.26519\n  (chisq-test :x x :y y :correct false) ;; X-sq = 2.01094, df=1, p-value = 0.15617\n\n  (def table (matrix [[31 12] [9 8]]))\n  (chisq-test :table table) ;; X-sq = 1.24145, df=1, p-value = 0.26519\n  (chisq-test :table table :correct false) ;; X-sq = 2.01094, df=1, p-value = 0.15617\n  ;; use the detabulate function to create data rows corresponding to the table\n  (def detab (detabulate :table table))\n  (chisq-test :x (sel detab :cols 0) :y (sel detab :cols 1))\n\n  ;; look at the hair-eye-color data\n  ;; turn the count data for males into a contigency table\n  (def male (matrix (sel (get-dataset :hair-eye-color) :cols 3 :rows (range 16)) 4))\n  (chisq-test :table male) ;; X-sq = 41.280, df = 9, p-value = 4.44E-6\n  ;; turn the count data for females into a contigency table\n  (def female (matrix (sel (get-dataset :hair-eye-color) :cols 3 :rows (range 16 32)) 4))\n  (chisq-test :table female) ;; X-sq = 106.664, df = 9, p-value = 7.014E-19,\n\n\n  ;; supply probabilities to goodness-of-fit test\n  (def table [89 37 30 28 2])\n  (def probs [0.40 0.20 0.20 0.19 0.01])\n  (chisq-test :table table :probs probs) ;; X-sq = 5.7947, df = 4, p-value = 0.215\n\n  ;; use frequencies instead of probabilities\n  (def freq [40 20 20 15 5])\n  (chisq-test :table table :freq freq) ;; X-sq = 9.9901, df = 4, p-value = 0.04059\n\n\n\nReferences:\n  http://www.itl.nist.gov/div898/handbook/eda/section3/eda35f.htm\n  http://en.wikipedia.org/wiki/Pearson's_chi-square_test\n  http://en.wikipedia.org/wiki/Yates'_chi-square_test",
   :name "chisq-test"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1480",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/correlation",
   :namespace "incanter.stats",
   :line 1480,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x y] [mat]),
   :doc
   "\nReturns the sample correlation of x and y, or the correlation\nmatrix of the given matrix.\n\nExamples:\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Correlation",
   :name "correlation"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2682",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/correlation-linearity-test",
   :namespace "incanter.stats",
   :line 2682,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Correlation_ratio\n\nIt is worth noting that if the relationship between values of  and values of overline y_x is linear (which is certainly true when there are only two possibilities for x) this will give the same result as the square of the correlation coefficient, otherwise the correlation ratio will be larger in magnitude. It can therefore be used for judging non-linear relationships.",
   :name "correlation-linearity-test"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2644",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/correlation-ratio",
   :namespace "incanter.stats",
   :line 2644,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([& xs]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Correlation_ratio\n\nIn statistics, the correlation ratio is a measure of the relationship between the statistical dispersion within individual categories and the dispersion across the whole population or sample. i.e. the weighted variance of the category means divided by the variance of all samples.\n\nExample\n\nSuppose there is a distribution of test scores in three topics (categories):\n\n    * Algebra: 45, 70, 29, 15 and 21 (5 scores)\n    * Geometry: 40, 20, 30 and 42 (4 scores)\n    * Statistics: 65, 95, 80, 70, 85 and 73 (6 scores).\n\nThen the subject averages are 36, 33 and 78, with an overall average of 52.\n\nThe sums of squares of the differences from the subject averages are 1952 for Algebra, 308 for Geometry and 600 for Statistics, adding to 2860, while the overall sum of squares of the differences from the overall average is 9640. The difference between these of 6780 is also the weighted sum of the square of the differences between the subject averages and the overall average:\n\n    5(36 − 52)2 + 4(33 − 52)2 + 6(78 − 52)2 = 6780\n\nThis gives\n\n    eta^2 =6780/9640=0.7033\n\nsuggesting that most of the overall dispersion is a result of differences between topics, rather than within topics. Taking the square root\n\n    eta = sqrt 6780/9640=0.8386\n\nObserve that for η = 1 the overall sample dispersion is purely due to dispersion among the categories and not at all due to dispersion within the individual categories. For a quick comprehension simply imagine all Algebra, Geometry, and Statistics scores being the same respectively, e.g. 5 times 36, 4 times 33, 6 times 78.",
   :name "correlation-ratio"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2904",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cosine-similarity",
   :namespace "incanter.stats",
   :line 2904,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Cosine_similarity\nhttp://www.appliedsoftwaredesign.com/cosineSimilarityCalculator.php\n\nThe Cosine Similarity of two vectors a and b is the ratio: a dot b / ||a|| ||b||\n\nLet d1 = {2 4 3 1 6}\nLet d2 = {3 5 1 2 5}\n\nCosine Similarity (d1, d2) =  dot(d1, d2) / ||d1|| ||d2||\n\ndot(d1, d2) = (2)*(3) + (4)*(5) + (3)*(1) + (1)*(2) + (6)*(5) = 61\n\n||d1|| = sqrt((2)^2 + (4)^2 + (3)^2 + (1)^2 + (6)^2) = 8.12403840464\n\n||d2|| = sqrt((3)^2 + (5)^2 + (1)^2 + (2)^2 + (5)^2) = 8\n\nCosine Similarity (d1, d2) = 61 / (8.12403840464) * (8)\n                           = 61 / 64.9923072371\n                           = 0.938572618717",
   :name "cosine-similarity"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1428",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/covariance",
   :namespace "incanter.stats",
   :line 1428,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x y] [mat]),
   :doc
   "\nReturns the sample covariance of x and y.\n\nExamples:\n  ;; create some data that covaries\n  (def x (sample-normal 100))\n  (def err (sample-normal 100))\n  (def y (plus (mult 5 x) err))\n  ;; estimate the covariance of x and y\n  (covariance x y)\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Covariance",
   :name "covariance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1765",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/cumulative-mean",
   :namespace "incanter.stats",
   :line 1765,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([coll]),
   :doc
   " Returns a sequence of cumulative means for the given collection. For instance\n  The first value equals the first value of the argument, the second value is\n  the mean of the first two arguments, the third is the mean of the first three\n  arguments, etc.\n\n  Examples:\n    (cumulative-mean (sample-normal 100))\n",
   :name "cumulative-mean"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2480",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/detabulate",
   :namespace "incanter.stats",
   :line 2480,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   " Take a contingency table of counts and returns a matrix of observations.\n\nExamples:\n\n  (use '(incanter core stats datasets))\n\n  (def by-gender (group-by (get-dataset :hair-eye-color) 2))\n  (def table (matrix (sel (first by-gender) :cols 3) 4))\n\n  (detabulate :table table)\n  (tabulate (detabulate :table table))\n\n  ;; example 2\n  (def data (matrix [[1 0]\n                     [1 1]\n                     [1 1]\n                     [1 0]\n                     [0 0]\n                     [1 1]\n                     [1 1]\n                     [1 0]\n                     [1 1]]))\n  (tabulate data)\n\n  (tabulate (detabulate :table (:table (tabulate data))))",
   :name "detabulate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2982",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/dice-coefficient",
   :namespace "incanter.stats",
   :line 2982,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Dice%27s_coefficient\nDice's coefficient (also known as the Dice coefficient) is a similarity measure related to the Jaccard index.",
   :name "dice-coefficient"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L3008",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/dice-coefficient-str",
   :namespace "incanter.stats",
   :line 3008,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Dice%27s_coefficient\n\nWhen taken as a string similarity measure, the coefficient may be calculated for two strings, x and y using bigrams.  here nt is the number of character bigrams found in both strings, nx is the number of bigrams in string x and ny is the number of bigrams in string y. For example, to calculate the similarity between:\n\n    night\n    nacht\n\nWe would find the set of bigrams in each word:\n\n    {ni,ig,gh,ht}\n    {na,ac,ch,ht}\n\nEach set has four elements, and the intersection of these two sets has only one element: ht.\n\nPlugging this into the formula, we calculate, s = (2 · 1) / (4 + 4) = 0.25.",
   :name "dice-coefficient-str"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2767",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/discordant-pairs",
   :namespace "incanter.stats",
   :line 2767,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc "http://en.wikipedia.org/wiki/Discordant_pairs",
   :name "discordant-pairs"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2876",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/euclidean-distance",
   :namespace "incanter.stats",
   :line 2876,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "http://en.wikipedia.org/wiki/Euclidean_distance\n\nthe Euclidean distance or Euclidean metric is the ordinary distance between two points that one would measure with a ruler, and is given by the Pythagorean formula. By using this formula as distance, Euclidean space (or even any inner product space) becomes a metric space. The associated norm is called the Euclidean norm. Older literature refers to the metric as Pythagorean metric.",
   :name "euclidean-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2790",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/gamma-coefficient",
   :namespace "incanter.stats",
   :line 2790,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "\nhttp://www.statsdirect.com/help/nonparametric_methods/kend.htm\n\nThe gamma coefficient is given as a measure of association that is highly resistant to tied data (Goodman and Kruskal, 1963):",
   :name "gamma-coefficient"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L3031",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/hamming-distance",
   :namespace "incanter.stats",
   :line 3031,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "http://en.wikipedia.org/wiki/Hamming_distance\n\nIn information theory, the Hamming distance between two strings of equal length is the number of positions at which the corresponding symbols are different. Put another way, it measures the minimum number of substitutions required to change one string into the other, or the number of errors that transformed one string into the other.",
   :name "hamming-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L51",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/indicator",
   :namespace "incanter.stats",
   :line 51,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([pred coll]),
   :doc
   "\nReturns a sequence of ones and zeros, where ones\nare returned when the given predicate is true for\ncorresponding element in the given collection, and\nzero otherwise.\n\nExamples:\n  (use 'incanter.stats)\n\n  (indicator #(neg? %) (sample-normal 10))\n\n  ;; return the sum of the positive values in a normal sample\n  (def x (sample-normal 100))\n  (sum (mult x (indicator #(pos? %) x)))",
   :name "indicator"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2971",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/jaccard-distance",
   :namespace "incanter.stats",
   :line 2971,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Jaccard_index\n\nThe Jaccard distance, which measures dissimilarity between sample sets, is complementary to the Jaccard coefficient and is obtained by subtracting the Jaccard coefficient from 1, or, equivalently, by dividing the difference of the sizes of the union and the intersection of two sets by the size of the union.",
   :name "jaccard-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2960",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/jaccard-index",
   :namespace "incanter.stats",
   :line 2960,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Jaccard_index\n\nThe Jaccard index, also known as the Jaccard similarity coefficient (originally coined coefficient de communauté by Paul Jaccard), is a statistic used for comparing the similarity and diversity of sample sets.\n\nThe Jaccard coefficient measures similarity between sample sets, and is defined as the size of the intersection divided by the size of the union of the sample sets.",
   :name "jaccard-index"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2718",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/kendalls-tau",
   :namespace "incanter.stats",
   :line 2718,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Kendall_tau_rank_correlation_coefficient\nhttp://www.statsdirect.com/help/nonparametric_methods/kend.htm\nhttp://mail.scipy.org/pipermail/scipy-dev/2009-March/011589.html\nbest explanation and example is in \"cluster analysis for researchers\" page 165.\nhttp://www.amazon.com/Cluster-Analysis-Researchers-Charles-Romesburg/dp/1411606175",
   :name "kendalls-tau"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2799",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/kendalls-w",
   :namespace "incanter.stats",
   :line 2799,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Kendall%27s_W\nhttp://faculty.chass.ncsu.edu/garson/PA765/friedman.htm\n\nSuppose that object i is given the rank ri,j by judge number j, where there are in total n objects and m judges. Then the total rank given to object i is\n\n    Ri = sum Rij\n\nand the mean value of these total ranks is\n\n    Rbar = 1/2 m (n + 1)\n\nThe sum of squared deviations, S, is defined as\n\n    S=sum1-n (Ri - Rbar)\n\nand then Kendall's W is defined as[1]\n\n    W= 12S / m^2(n^3-n)\n\nIf the test statistic W is 1, then all the survey respondents have been unanimous, and each respondent has assigned the same order to the list of concerns. If W is 0, then there is no overall trend of agreement among the respondents, and their responses may be regarded as essentially random. Intermediate values of W indicate a greater or lesser degree of unanimity among the various responses.\n\nLegendre[2] discusses a variant of the W statistic which accommodates ties in the rankings and also describes methods of making significance tests based on W.\n\n [{:observation [1 2 3]} {} ... {}] -> W",
   :name "kendalls-w"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1523",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/kurtosis",
   :namespace "incanter.stats",
   :line 1523,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nReturns the kurtosis of the data, x. \"Kurtosis is a measure of the \"peakedness\"\nof the probability distribution of a real-valued random variable. Higher kurtosis\nmeans more of the variance is due to infrequent extreme deviations, as opposed to\nfrequent modestly-sized deviations.\" (Wikipedia)\n\nExamples:\n\n  (kurtosis (sample-normal 100000)) ;; approximately 0\n  (kurtosis (sample-gamma 100000)) ;; approximately 6\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Kurtosis",
   :name "kurtosis"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L3046",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/lee-distance",
   :namespace "incanter.stats",
   :line 3046,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b q]),
   :doc
   "http://en.wikipedia.org/wiki/Lee_distance\n\nIn coding theory, the Lee distance is a distance between two strings x1x2...xn and y1y2...yn of equal length n over the q-ary alphabet {0,1,…,q-1} of size q >= 2. It is metric.\n\nIf q = 2 or q = 3 the Lee distance coincides with the Hamming distance.\n\nThe metric space induced by the Lee distance is a discrete analog of the elliptic space.",
   :name "lee-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L3093",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/levenshtein-distance",
   :namespace "incanter.stats",
   :line 3093,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Levenshtein_distance\n\ninternal representation is a table d with m+1 rows and n+1 columns\n\nwhere m is the length of a and m is the length of b.\n\nIn information theory and computer science, the Levenshtein distance is a metric for measuring the amount of difference between two sequences (i.e., the so called edit distance). The Levenshtein distance between two strings is given by the minimum number of operations needed to transform one string into the other, where an operation is an insertion, deletion, or substitution of a single character.\n\nFor example, the Levenshtein distance between \"kitten\" and \"sitting\" is 3, since the following three edits change one into the other, and there is no way to do it with fewer than three edits:\n\n   1. kitten → sitten (substitution of 's' for 'k')\n   2. sitten → sittin (substitution of 'i' for 'e')\n   3. sittin → sitting (insert 'g' at the end).\n\nThe Levenshtein distance has several simple upper and lower bounds that are useful in applications which compute many of them and compare them. These include:\n\n    * It is always at least the difference of the sizes of the two strings.\n    * It is at most the length of the longer string.\n    * It is zero if and only if the strings are identical.\n    * If the strings are the same size, the Hamming distance is an upper bound on the Levenshtein distance.",
   :name "levenshtein-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1943",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/linear-model",
   :namespace "incanter.stats",
   :line 1943,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([y x & options]),
   :doc
   "\nReturns the results of performing a OLS linear regression of y on x.\n\nArguments:\n  y is a vector (or sequence) of values for the dependent variable\n  x is a vector or matrix of values for the independent variables\n\nOptions:\n  :intercept (default true) indicates weather an intercept term should be included\n\nReturns:\n  a map, of type ::linear-model, containing:\n    :design-matrix -- a matrix containing the independent variables, and an intercept columns\n    :coefs -- the regression coefficients\n    :t-tests -- t-test values of coefficients\n    :t-probs -- p-values for t-test values of coefficients\n    :coefs-ci -- 95% percentile confidence interval\n    :fitted -- the predicted values of y\n    :residuals -- the residuals of each observation\n    :std-errors -- the standard errors of the coeffients\n    :sse -- the sum of squared errors, also called the residual sum of squares\n    :ssr -- the regression sum of squares, also called the explained sum of squares\n    :sst -- the total sum of squares (proportional to the sample variance)\n    :r-square -- coefficient of determination\n\nExamples:\n  (use '(incanter core stats datasets charts))\n  (def iris (to-matrix (get-dataset :iris) :dummies true))\n  (def y (sel iris :cols 0))\n  (def x (sel iris :cols (range 1 6)))\n  (def iris-lm (linear-model y x)) ; with intercept term\n\n  (keys iris-lm) ; see what fields are included\n  (:coefs iris-lm)\n  (:sse iris-lm)\n  (quantile (:residuals iris-lm))\n  (:r-square iris-lm)\n  (:adj-r-square iris-lm)\n  (:f-stat iris-lm)\n  (:f-prob iris-lm)\n  (:df iris-lm)\n\n  (def x1 (range 0.0 3 0.1))\n  (view (xy-plot x1 (cdf-f x1 :df1 4 :df2 144)))\n\n\nReferences:\n  http://en.wikipedia.org/wiki/OLS_Regression\n  http://en.wikipedia.org/wiki/Coefficient_of_determination",
   :name "linear-model"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L3196",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/mahalanobis-distance",
   :namespace "incanter.stats",
   :line 3196,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   "Returns the Mahalanobis distance between x, which is \n  either a vector or matrix of row vectors, and the \n  centroid of the observations in the matrix :y.\n \n Arguments:\n   x -- either a vector or a matrix of row vectors\n \n Options:\n   :y -- Defaults to x, must be a matrix of row vectors which will be used to calculate a centroid\n   :W -- Defaults to (solve (covariance y)), if an identity matrix is provided, the mahalanobis-distance\n         function will be equal to the Euclidean distance.\n   :centroid -- Defaults to (map mean (trans y))\n\n\n References:\n   http://en.wikipedia.org/wiki/Mahalanobis_distance\n\n\n Examples:\n\n   (use '(incanter core stats charts))\n\n   ;; generate some multivariate normal data with a single outlier.\n   (def data (bind-rows\n               (bind-columns \n                 (sample-mvn 100 \n                             :sigma (matrix [[1 0.9] \n                                             [0.9 1]])))\n               [-1.75 1.75]))\n\n   ;; view a scatter plot of the data\n   (let [[x y] (trans data)]\n     (doto (scatter-plot x y)\n       (add-points [(mean x)] [(mean y)])\n       (add-pointer -1.75 1.75 :text \"Outlier\")\n       (add-pointer (mean x) (mean y) :text \"Centroid\")\n       view))\n\n   ;; calculate the distances of each point from the centroid.\n   (def dists (mahalanobis-distance data))\n   ;; view a bar-chart of the distances\n   (view (bar-chart (range 102) dists))\n\n   ;; Now contrast with the Euclidean distance.\n   (def dists (mahalanobis-distance data :W (matrix [[1 0] [0 1]])))\n   ;; view a bar-chart of the distances\n   (view (bar-chart (range 102) dists))\n\n\n   ;; another example\n   (mahalanobis-distance [-1.75 1.75] :y data)\n   (mahalanobis-distance [-1.75 1.75] \n                     :y data \n                     :W (matrix [[1 0] \n                                 [0 1]]))\n",
   :name "mahalanobis-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2893",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/manhattan-distance",
   :namespace "incanter.stats",
   :line 2893,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "http://en.wikipedia.org/wiki/Manhattan_distance\n\nusual metric of Euclidean geometry is replaced by a new metric in which the distance between two points is the sum of the (absolute) differences of their coordinates. The taxicab metric is also known as rectilinear distance, L1 distance or l1 norm (see Lp space), city block distance, Manhattan distance, or Manhattan length",
   :name "manhattan-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1394",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/mean",
   :namespace "incanter.stats",
   :line 1394,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nReturns the mean of the data, x.\n\nExamples:\n  (mean (sample-normal 100))\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Mean",
   :name "mean"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1505",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/median",
   :namespace "incanter.stats",
   :line 1505,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nReturns the median of the data, x.\n\nExamples:\n  (median (sample-normal 100))\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Median",
   :name "median"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2852",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/minkowski-distance",
   :namespace "incanter.stats",
   :line 2852,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b p]),
   :doc
   "http://en.wikipedia.org/wiki/Minkowski_distance\nhttp://en.wikipedia.org/wiki/Lp_space\n\nThe Minkowski distance is a metric on Euclidean space which can be considered as a generalization of both the Euclidean distance and the Manhattan distance.\n\nMinkowski distance is typically used with p being 1 or 2. The latter is the Euclidean distance, while the former is sometimes known as the Manhattan distance.\n\nIn the limiting case of p reaching infinity we obtain the Chebyshev distance.",
   :name "minkowski-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2994",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/n-grams",
   :namespace "incanter.stats",
   :line 2994,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([n s]),
   :doc
   "returns a set of the unique n-grams in a string.\n\nthis is using actual sets here, discards dupicate n-grams?",
   :name "n-grams"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2777",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/normalized-kendall-tau-distance",
   :namespace "incanter.stats",
   :line 2777,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Kendall_tau_distance\n\nKendall tau distance is the total number of discordant pairs.",
   :name "normalized-kendall-tau-distance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2624",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/odds-ratio",
   :namespace "incanter.stats",
   :line 2624,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([p1 p2]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Odds_ratio\n\nDefinition in terms of group-wise odds\n\nThe odds ratio is the ratio of the odds of an event occurring in one group to the odds of it occurring in another group, or to a sample-based estimate of that ratio.\n\n\nSuppose that in a sample of 100 men, 90 have drunk wine in the previous week, while in a sample of 100 women only 20 have drunk wine in the same period. The odds of a man drinking wine are 90 to 10, or 9:1, while the odds of a woman drinking wine are only 20 to 80, or 1:4 = 0.25:1. The odds ratio is thus 9/0.25, or 36, showing that men are much more likely to drink wine than women. \n\nRelation to statistical independence\n\nIf X and Y are independent, their joint probabilities can be expressed in terms of their marginal probabilities.  In this case, the odds ratio equals one, and conversely the odds ratio can only equal one if the joint probabilities can be factored in this way. Thus the odds ratio equals one if and only if X and Y are independent.",
   :name "odds-ratio"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2754",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pairings",
   :namespace "incanter.stats",
   :line 2754,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc "confusing ass name.",
   :name "pairings"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2742",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pairs",
   :namespace "incanter.stats",
   :line 2742,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "returns unique pairs of a and b where members of a and b can not be paired with the correspoding slot in the other list.",
   :name "pairs"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L451",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-beta",
   :namespace "incanter.stats",
   :line 451,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Beta pdf of the given value of x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's dbeta function.\n\nOptions:\n  :alpha (default 1)\n  :beta (default 1)\n\nSee also:\n    cdf-beta and sample-beta\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Beta.html\n    http://en.wikipedia.org/wiki/Beta_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-beta 0.5 :alpha 1 :beta 2)",
   :name "pdf-beta"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1072",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-binomial",
   :namespace "incanter.stats",
   :line 1072,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Bionomial pdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's dbinom\n\nOptions:\n  :size (default 1)\n  :prob (default 1/2)\n\nSee also:\n    cdf-binomial and sample-binomial\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Binomial.html\n    http://en.wikipedia.org/wiki/Binomial_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-binomial 10 :prob 1/4 :size 20)",
   :name "pdf-binomial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L647",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-chisq",
   :namespace "incanter.stats",
   :line 647,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Chi Square pdf of the given value of x.  It will return a sequence\nof values, if x is a sequence. Same as R's dchisq function.\n\nOptions:\n  :df (default 1)\n\nSee also:\n    cdf-chisq and sample-chisq\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/ChiSquare.html\n    http://en.wikipedia.org/wiki/Chi_square_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-chisq 5.0 :df 2)",
   :name "pdf-chisq"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L867",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-exp",
   :namespace "incanter.stats",
   :line 867,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Exponential pdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's dexp\n\nOptions:\n  :rate (default 1)\n\nSee also:\n    cdf-exp and sample-exp\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Exponential.html\n    http://en.wikipedia.org/wiki/Exponential_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-exp 2.0 :rate 1/2)",
   :name "pdf-exp"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L85",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-f",
   :namespace "incanter.stats",
   :line 85,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the F pdf of the given value, x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's df function.\n\nOptions:\n  :df1 (default 1)\n  :df2 (default 1)\n\nSee also:\n    cdf-f and quantile-f\n\nReferences:\n    http://en.wikipedia.org/wiki/F_distribution\n    http://mathworld.wolfram.com/F-Distribution.html\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-f 1.0 :df1 5 :df2 2)",
   :name "pdf-f"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L549",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-gamma",
   :namespace "incanter.stats",
   :line 549,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Gamma pdf for the given value of x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's dgamma function.\n\nOptions:\n  :shape (default 1)\n  :rate (default 1)\n\nSee also:\n    cdf-gamma and sample-gamma\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Gamma.html\n    http://en.wikipedia.org/wiki/Gamma_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-gamma 10 :shape 1 :rate 2)",
   :name "pdf-gamma"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1258",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-neg-binomial",
   :namespace "incanter.stats",
   :line 1258,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Negative Binomial pdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's dnbinom\n\nOptions:\n  :size (default 10)\n  :prob (default 1/2)\n\nSee also:\n    cdf-neg-binomial and sample-neg-binomial\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/NegativeBinomial.html\n    http://en.wikipedia.org/wiki/Negative_binomial_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-neg-binomial 10 :prob 1/2 :size 20)",
   :name "pdf-neg-binomial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L166",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-normal",
   :namespace "incanter.stats",
   :line 166,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Normal pdf of the given value, x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's dnorm function.\n\nOptions:\n  :mean (default 0)\n  :sd (default 1)\n\nSee also:\n    cdf-normal, quantile-normal, sample-normal\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Normal.html\n    http://en.wikipedia.org/wiki/Normal_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-normal 1.96 :mean -2 :sd (sqrt 0.5))",
   :name "pdf-normal"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1168",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-poisson",
   :namespace "incanter.stats",
   :line 1168,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Poisson pdf of the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's dpois\n\nOptions:\n  :lambda (default 1)\n\nSee also:\n    cdf-poisson and sample-poisson\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Poisson.html\n    http://en.wikipedia.org/wiki/Poisson_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-poisson 5 :lambda 10)",
   :name "pdf-poisson"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L738",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-t",
   :namespace "incanter.stats",
   :line 738,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Student's t pdf for the given value of x. It will return a sequence\nof values, if x is a sequence. Same as R's dt function.\n\nOptions:\n  :df (default 1)\n\nSee also:\n    cdf-t, quantile-t, and sample-t\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/StudentT.html\n    http://en.wikipedia.org/wiki/Student-t_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-t 1.2 :df 10)",
   :name "pdf-t"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L352",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/pdf-uniform",
   :namespace "incanter.stats",
   :line 352,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns the Uniform pdf of the given value of x. It will return a sequence\nof values, if x is a sequence. This is equivalent to R's dunif function.\n\nOptions:\n  :min (default 0)\n  :max (default 1)\n\nSee also:\n    cdf-uniform and sample-uniform\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/DoubleUniform.html\n    http://en.wikipedia.org/wiki/Uniform_distribution\n    http://en.wikipedia.org/wiki/Probability_density_function\n\nExample:\n    (pdf-uniform 5)\n    (pdf-uniform 5 :min 1 :max 10)",
   :name "pdf-uniform"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1809",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/permute",
   :namespace "incanter.stats",
   :line 1809,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x] [x y]),
   :doc
   " If provided a single argument, returns a permuted version of the\ngiven collection. (perm x) is the same as (sample x).\n\nIf provided two arguments, returns two lists that are permutations\nacross the given collections. In other words, each of the new collections\nwill contain elements from both of the given collections. Useful for\npermutation tests or randomization tests.\n\nExamples:\n\n  (permute (range 10))\n  (permute (range 10) (range 10 20))",
   :name "permute"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2593",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/predict",
   :namespace "incanter.stats",
   :line 2593,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([model x]),
   :doc
   "Takes a linear-model and an x value (either a scalar or vector)\nand returns the predicted value based on the linear-model.",
   :name "predict"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2422",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/principal-components",
   :namespace "incanter.stats",
   :line 2422,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   "\nPerforms a principal components analysis on the given data matrix.\nEquivalent to R's prcomp function.\n\nReturns:\n  A map with the following fields:\n  :std-dev -- the standard deviations of the principal compoenents\n      (i.e. the square roots of the eigenvalues of the correlation\n      matrix, though the calculation is actually done with the\n      singular values of the data matrix.\n  :rotation -- the matrix of variable loadings (i.e. a matrix\n      whose columns contain the eigenvectors).\n\n\nExamples:\n\n  (use '(incanter core stats charts datasets))\n  ;; load the iris dataset\n  (def iris (to-matrix (get-dataset :iris)))\n  ;; run the pca\n  (def pca (principal-components (sel iris :cols (range 4))))\n  ;; extract the first two principal components\n  (def pc1 (sel (:rotation pca) :cols 0))\n  (def pc2 (sel (:rotation pca) :cols 1))\n\n  ;; project the first four dimension of the iris data onto the first\n  ;; two principal components\n  (def x1 (mmult (sel iris :cols (range 4)) pc1))\n  (def x2 (mmult (sel iris :cols (range 4)) pc2))\n\n  ;; now plot the transformed data, coloring each species a different color\n  (doto (scatter-plot (sel x1 :rows (range 50)) (sel x2 :rows (range 50))\n                      :x-label \"PC1\" :y-label \"PC2\" :title \"Iris PCA\")\n        (add-points (sel x1 :rows (range 50 100)) (sel x2 :rows (range 50 100)))\n        (add-points (sel x1 :rows (range 100 150)) (sel x2 :rows (range 100 150)))\n        view)\n\n\n  ;; alternatively, the :group-by option can be used in scatter-plot\n  (view (scatter-plot x1 x2\n                      :group-by (sel iris :cols 4)\n                      :x-label \"PC1\" :y-label \"PC2\" :title \"Iris PCA\"))\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Principal_component_analysis",
   :name "principal-components"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2841",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/product-marginal-test",
   :namespace "incanter.stats",
   :line 2841,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([j]),
   :doc
   "the joint PMF of independent variables is equal to the product of their marginal PMFs.",
   :name "product-marginal-test"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1563",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/quantile",
   :namespace "incanter.stats",
   :line 1563,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   "\nReturns the quantiles of the data, x. By default it returns the min,\n25th-percentile, 50th-percentile, 75th-percentile, and max value.\n\nOptions:\n  :probs (default [0.0 0.25 0.5 0.75 1.0])\n\nExamples:\n  (quantile (sample-normal 100))\n  (quantile (sample-normal 100) :probs [0.025 0.975])\n  (quantile (sample-normal 100) :probs 0.975)\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Quantile",
   :name "quantile"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L225",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/quantile-normal",
   :namespace "incanter.stats",
   :line 225,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([probability & options]),
   :doc
   " Returns the inverse of the Normal CDF for the given probability.\nIt will return a sequence of values, if given a sequence of\nprobabilities. This is equivalent to R's qnorm function.\n\nOptions:\n  :mean (default 0)\n  :sd (default 1)\n\nReturns:\n  a value x, where (cdf-normal x) = probability\n\nSee also:\n    pdf-normal, cdf-normal, and sample-normal\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/Probability.html\n    http://en.wikipedia.org/wiki/Normal_distribution\n    http://en.wikipedia.org/wiki/Quantile\n\nExample:\n    (quantile-normal 0.975)\n    (quantile-normal [0.025 0.975] :mean -2 :sd (sqrt 0.5))",
   :name "quantile-normal"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L795",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/quantile-t",
   :namespace "incanter.stats",
   :line 795,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([probability & options]),
   :doc
   " Returns the inverse of the Student's t CDF for the given probability\n(i.e. the quantile).  It will return a sequence of values, if x is\na sequence of probabilities. This is equivalent to R's qt function.\n\nOptions:\n  :df (default 1)\n\nReturns:\n  a value x, where (cdf-t x) = probability\n\nSee also:\n   pdf-t, cdf-t, and sample-t\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/Probability.html\n    http://en.wikipedia.org/wiki/Student-t_distribution\n    http://en.wikipedia.org/wiki/Quantile\n\nExample:\n    (quantile-t 0.975)\n    (quantile-t [0.025 0.975] :df 25)\n    (def df [1 2 3 4 5 6 7 8 9 10 20 50 100 1000])\n    (map #(quantile-t 0.025 :df %) df)",
   :name "quantile-t"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2692",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/rank-index",
   :namespace "incanter.stats",
   :line 2692,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\ngiven a seq, returns a map where the keys are the values of the seq and the values are the positional rank of each member o the seq.",
   :name "rank-index"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1598",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample",
   :namespace "incanter.stats",
   :line 1598,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Returns a sample of the given size from the given collection. If replacement\nis set to false it returns a set, otherwise it returns a list.\n\nArguments:\n  x -- collection to be sampled from\n\nOptions:\n  :size -- (default (count x) sample size\n  :replacement (default true) -- sample with replacement\n\n\nExamples:\n  (sample (range 10)) ; permutation of numbers zero through ten\n  (sample [:red :green :blue] :size 10) ; choose 10 items that are either :red, :green, or :blue.\n  (sample (seq \"abcdefghijklmnopqrstuvwxyz\")  :size 4 :replacement false) ; choose 4 random letters.",
   :name "sample"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L517",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-beta",
   :namespace "incanter.stats",
   :line 517,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Beta distribution.\nThis is equivalent to R's rbeta function.\n\nOptions:\n  :alpha (default 1)\n  :beta (default 1)\n  These default values produce a Uniform distribution.\n\nSee also:\n    pdf-beta and cdf-beta\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Beta.html\n    http://en.wikipedia.org/wiki/Beta_distribution\n\nExample:\n    (sample-beta 1000 :alpha 1 :beta 2)",
   :name "sample-beta"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1136",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-binomial",
   :namespace "incanter.stats",
   :line 1136,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Binomial distribution.\nSame as R's rbinom\n\nOptions:\n  :size (default 1)\n  :prob (default 1/2)\n\nSee also:\n    cdf-binomial and sample-binomial\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Binomial.html\n    http://en.wikipedia.org/wiki/Binomial_distribution\n\nExample:\n    (sample-binomial 1000 :prob 1/4 :size 20)",
   :name "sample-binomial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L708",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-chisq",
   :namespace "incanter.stats",
   :line 708,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Chi Square distribution\nSame as R's rchisq function.\n\nOptions:\n  :df (default 1)\n\nSee also:\n    pdf-chisq and cdf-chisq\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/ChiSquare.html\n    http://en.wikipedia.org/wiki/Chi_square_distribution\n\nExample:\n    (sample-chisq 1000 :df 2)",
   :name "sample-chisq"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1021",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-dirichlet",
   :namespace "incanter.stats",
   :line 1021,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size alpha]),
   :doc
   "\nExamples:\n  (use '(incanter core stats charts))\n\n  ;; a total of 1447 adults were polled to indicate their preferences for\n  ;; candidate 1 (y1=727), candidate 2 (y2=583), or some other candidate or no\n  ;; preference (y3=137).\n\n  ;; the counts y1, y2, and y3 are assumed to have a multinomial distribution\n  ;; If a uniform prior distribution is assigned to the multinomial vector\n  ;; theta = (th1, th2, th3), then the posterior distribution of theta is\n  ;; proportional to g(theta) = th1^y1 * th2^y2 * th3^y3, which is a\n  ;; dirichlet distribution with parameters (y1+1, y2+1, y3+1)\n  (def  theta (sample-dirichlet 1000 [(inc 727) (inc 583) (inc 137)]))\n  ;; view means, 95% CI, and histograms of the proportion parameters\n  (mean (sel theta :cols 0))\n  (quantile (sel theta :cols 0) :probs [0.0275 0.975])\n  (view (histogram (sel theta :cols 0)))\n  (mean (sel theta :cols 1))\n  (quantile (sel theta :cols 1) :probs [0.0275 0.975])\n  (view (histogram (sel theta :cols 1)))\n  (mean (sel theta :cols 2))\n  (quantile (sel theta :cols 2) :probs [0.0275 0.975])\n  (view (histogram (sel theta :cols 2)))\n\n  ;; view  a histogram of the difference in proportions between the first\n  ;; two candidates\n  (view (histogram (minus (sel theta :cols 0) (sel theta :cols 1))))",
   :name "sample-dirichlet"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L921",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-exp",
   :namespace "incanter.stats",
   :line 921,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Exponential distribution.\nSame as R's rexp\n\nOptions:\n  :rate (default 1)\n\nSee also:\n    pdf-exp, and cdf-exp\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Exponential.html\n    http://en.wikipedia.org/wiki/Exponential_distribution\n\nExample:\n    (sample-exp 1000 :rate 1/2)",
   :name "sample-exp"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L614",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-gamma",
   :namespace "incanter.stats",
   :line 614,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Gamma distribution.\nThis is equivalent to R's rgamma function.\n\nOptions:\n  :shape (default 1)\n  :rate (default 1)\n\nSee also:\n    pdf-gamma, cdf-gamma, and quantile-gamma\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Gamma.html\n    http://en.wikipedia.org/wiki/Gamma_distribution\n\nExample:\n    (sample-gamma 1000 :shape 1 :rate 2)",
   :name "sample-gamma"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L990",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-inv-wishart",
   :namespace "incanter.stats",
   :line 990,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   "\nReturns a p-by-p symmetric distribution drawn from an inverse-Wishart distribution\n\nOptions:\n  :p (default 2) -- number of dimensions of resulting matrix\n  :df (default p) -- degree of freedoms (aka n), df <= p\n  :scale (default (identity-matrix p)) -- positive definite matrix (aka V)\n\nExamples:\n  (use 'incanter.stats)\n  (sample-inv-wishart :df 10  :p 4)\n\n  ;; calculate the mean of 1000 wishart matrices, should equal (mult df scale)\n  (div (reduce plus (for [_ (range 1000)] (sample-wishart :p 4))) 1000)\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Inverse-Wishart_distribution",
   :name "sample-inv-wishart"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L292",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-mvn",
   :namespace "incanter.stats",
   :line 292,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Multivariate Normal\ndistribution. This is equivalent to R's mvtnorm::rmvnorm function.\n\nArguments:\n  size -- the size of the sample to return\n\nOptions:\n  :mean (default (repeat (ncol sigma) 0))\n  :sigma (default (identity-matrix (count mean)))\n\n\nExamples:\n\n  (use '(incanter core stats charts))\n  (def mvn-samp (sample-mvn 1000 :mean [7 5] :sigma (matrix [[2 1.5] [1.5 3]])))\n  (covariance mvn-samp)\n  (def means (map mean (trans mvn-samp)))\n\n  ;; plot scatter-plot of points\n  (def mvn-plot (scatter-plot (sel mvn-samp :cols 0) (sel mvn-samp :cols 1)))\n  (view mvn-plot)\n  ;; add centroid to plot\n  (add-points mvn-plot [(first means)] [(second means)])\n\n  ;; add regression line to scatter plot\n  (def x (sel mvn-samp :cols 0))\n  (def y (sel mvn-samp :cols 1))\n  (def lm (linear-model y x))\n  (add-lines mvn-plot x (:fitted lm))\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Multivariate_normal",
   :name "sample-mvn"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1322",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-neg-binomial",
   :namespace "incanter.stats",
   :line 1322,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Negative Binomial distribution.\nSame as R's rnbinom\n\nOptions:\n  :size (default 10)\n  :prob (default 1/2)\n\nSee also:\n    pdf-neg-binomial and cdf-neg-binomial\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/NegativeBinomial.html\n    http://en.wikipedia.org/wiki/Negative_binomial_distribution\n\nExample:\n    (sample-neg-binomial 1000 :prob 1/2 :size 20)",
   :name "sample-neg-binomial"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L260",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-normal",
   :namespace "incanter.stats",
   :line 260,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Normal distribution\nThis is equivalent to R's rnorm function.\n\nOptions:\n  :mean (default 0)\n  :sd (default 1)\n\nSee also:\n    pdf-normal, cdf-normal, quantile-normal\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Normal.html\n    http://en.wikipedia.org/wiki/Normal_distribution\n\nExample:\n    (sample-normal 1000 :mean -2 :sd (sqrt 0.5))",
   :name "sample-normal"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1837",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-permutations",
   :namespace "incanter.stats",
   :line 1837,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([n x] [n x y]),
   :doc
   " If provided a two arguments (n x), it returns a list of n permutations\nof x. If provided three (n x y) arguments, returns a list with two with n permutations of\neach arguments, where each permutation is drawn from the pooled arguments.\n\nArguments:\n  n -- number of randomized versions of the original two groups to return\n  x -- group 1\n  y -- (default nil) group 2\n\n\nExamples:\n\n  (use '(incanter core stats))\n  (sample-permutations 10 (range 10))\n  (sample-permutations 10 (range 10) (range 10 20))\n\n  ;; extended example with plant-growth data\n  (use '(incanter core stats datasets charts))\n\n  ;; load the plant-growth dataset\n  (def data (to-matrix (get-dataset :plant-growth)))\n\n  ;; break the first column of the data into groups based on treatment (second column).\n  (def groups (group-by data 1 :cols 0))\n\n  ;; define a function for the statistic of interest\n  (defn means-diff [x y] (minus (mean x) (mean y)))\n\n  ;; calculate the difference in sample means between the two groups\n  (def samp-mean-diff (means-diff (first groups) (second groups))) ;; 0.371\n\n  ;; create 500 permuted versions of the original two groups\n  (def permuted-groups (sample-permutations 1000 (first groups) (second groups)))\n\n  ;; calculate the difference of means of the 500 samples\n  (def permuted-means-diffs1 (map means-diff (first permuted-groups) (second permuted-groups)))\n\n  ;; use an indicator function that returns 1 when the randomized means diff is greater\n  ;; than the original sample mean, and zero otherwise. Then take the mean of this sequence\n  ;; of ones and zeros. That is the proportion of times you would see a value more extreme\n  ;; than the sample mean (i.e. the p-value).\n  (mean (indicator #(> % samp-mean-diff) permuted-means-diffs1)) ;; 0.088\n\n  ;; calculate the 95% confidence interval of the null hypothesis. If the\n  ;; sample difference in means is outside of this range, that is evidence\n  ;; that the two means are statistically significantly different.\n  (quantile permuted-means-diffs1 :probs [0.025 0.975]) ;; (-0.606 0.595)\n\n  ;; Plot a histogram of the permuted-means-diffs using the density option,\n  ;; instead of the default frequency, and then add a normal pdf curve with\n  ;; the mean and sd of permuted-means-diffs data for a visual comparison.\n  (doto (histogram permuted-means-diffs1 :density true)\n        (add-lines (range -1 1 0.01) (pdf-normal (range -1 1 0.01)\n                                                 :mean (mean permuted-means-diffs1)\n                                                 :sd (sd permuted-means-diffs1)))\n        view)\n\n  ;; compare the means of treatment 2 and control\n  (def permuted-groups (sample-permutations 1000 (first groups) (last groups)))\n  (def permuted-means-diffs2 (map means-diff (first permuted-groups) (second permuted-groups)))\n  (def samp-mean-diff (means-diff (first groups) (last groups))) ;; -0.4939\n  (mean (indicator #(< % samp-mean-diff) permuted-means-diffs2)) ;; 0.022\n  (quantile permuted-means-diffs2 :probs [0.025 0.975]) ;; (-0.478 0.466)\n\n  ;; compare the means of treatment 1 and treatment 2\n  (def permuted-groups (sample-permutations 1000 (second groups) (last groups)))\n  (def permuted-means-diffs3 (map means-diff (first permuted-groups) (second permuted-groups)))\n  (def samp-mean-diff (means-diff (second groups) (last groups))) ;; -0.865\n  (mean (indicator #(< % samp-mean-diff) permuted-means-diffs3)) ;;  0.002\n  (quantile permuted-means-diffs3 :probs [0.025 0.975]) ;; (-0.676 0.646)\n\n  (doto (box-plot permuted-means-diffs1)\n        (add-box-plot permuted-means-diffs2)\n        (add-box-plot permuted-means-diffs3)\n        view)\n\n\n  Further Reading:\n    http://en.wikipedia.org/wiki/Resampling_(statistics)",
   :name "sample-permutations"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1228",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-poisson",
   :namespace "incanter.stats",
   :line 1228,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Poisson distribution.\nSame as R's rpois\n\nOptions:\n  :lambda (default 1)\n\nSee also:\n    pdf-poisson and cdf-poisson\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/Poisson.html\n    http://en.wikipedia.org/wiki/Poisson_distribution\n\nExample:\n    (sample-poisson 1000 :lambda 10)",
   :name "sample-poisson"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L835",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-t",
   :namespace "incanter.stats",
   :line 835,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Student's t distribution.\nSame as R's rt function.\n\nOptions:\n  :df (default 1)\n\nSee also:\n    pdf-t, cdf-t, and quantile-t\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/StudentT.html\n    http://en.wikipedia.org/wiki/Student-t_distribution\n\nExample:\n    (cdf-t 1000 :df 10)",
   :name "sample-t"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L412",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-uniform",
   :namespace "incanter.stats",
   :line 412,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([size & options]),
   :doc
   " Returns a sample of the given size from a Uniform distribution.\nThis is equivalent to R's runif function.\n\nOptions:\n  :min (default 0)\n  :max (default 1)\n  :integers (default false)\n\nSee also:\n    pdf-uniform and cdf-uniform\n\nReferences:\n    http://incanter.org/docs/parallelcolt/api/cern/jet/random/tdouble/DoubleUniform.html\n    http://en.wikipedia.org/wiki/Uniform_distribution\n\nExample:\n    (sample-uniform 1000)\n    (sample-uniform 1000 :min 1 :max 10)",
   :name "sample-uniform"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L953",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sample-wishart",
   :namespace "incanter.stats",
   :line 953,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([& options]),
   :doc
   "\nReturns a p-by-p symmetric distribution drawn from a Wishart distribution\n\nOptions:\n  :p (default 2) -- number of dimensions of resulting matrix\n  :df (default p) -- degree of freedoms (aka n), df <= p\n  :scale (default (identity-matrix p)) -- positive definite matrix (aka V)\n\nExamples:\n  (use 'incanter.stats)\n  (sample-wishart :df 10  :p 4)\n\n  ;; calculate the mean of 1000 wishart matrices, should equal (mult df scale)\n  (div (reduce plus (for [_ (range 1000)] (sample-wishart :p 4))) 1000)\n\n\nReferences:\n  http://en.wikipedia.org/wiki/Wishart_distribution#",
   :name "sample-wishart"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1460",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sd",
   :namespace "incanter.stats",
   :line 1460,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nReturns the sample standard deviation of the data, x. Equivalent to\nR's sd function.\n\nExamples:\n  (sd (sample-normal 100))\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Standard_deviation",
   :name "sd"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2575",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/simple-regression",
   :namespace "incanter.stats",
   :line 2575,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([y x & options]),
   :doc
   "A stripped version of linear-model that returns a map containing only\nthe coefficients.",
   :name "simple-regression"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1544",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/skewness",
   :namespace "incanter.stats",
   :line 1544,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nReturns the skewness of the data, x. \"Skewness is a measure of the asymmetry\nof the probability distribution of a real-valued random variable.\" (Wikipedia)\n\nExamples:\n\n  (skewness (sample-normal 100000)) ;; approximately 0\n  (skewness (sample-gamma 100000)) ;; approximately 2\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Skewness",
   :name "skewness"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2603",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/smooth-discrete-probs",
   :namespace "incanter.stats",
   :line 2603,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([probs buckets]),
   :doc
   "\nsmooth a map of discrete probabilities.\n\nclear up any discrete steps that are missing and should be there.\n\nTODO: single class may have a spike of 100% probability.",
   :name "smooth-discrete-probs"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L3067",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sorensen-index",
   :namespace "incanter.stats",
   :line 3067,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/S%C3%B8rensen_similarity_index#cite_note-4\n\nThe Sørensen index, also known as Sørensen’s similarity coefficient, is a statistic used for comparing the similarity of two samples. where A and B are the species numbers in samples A and B, respectively, and C is the number of species shared by the two samples. \n\n The Sørensen index is identical to Dice's coefficient which is always in [0, 1] range. Sørensen index used as a distance measure, 1 − QS, is identical to Hellinger distance and Bray–Curtis dissimilarity.\n\nThe Sørensen coefficient is mainly useful for ecological community data (e.g. Looman & Campbell, 1960[3]). Justification for its use is primarily empirical rather than theoretical (although it can be justified theoretically as the intersection of two fuzzy sets[4]). As compared to Euclidean distance, Sørensen distance retains sensitivity in more heterogeneous data sets and gives less weight to outliers\n\nThis function assumes you pass in a and b as sets.\n\nThe sorensen index extended to abundance instead of incidence of species is called the Czekanowski index.",
   :name "sorensen-index"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2699",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/spearmans-rho",
   :namespace "incanter.stats",
   :line 2699,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\nhttp://en.wikipedia.org/wiki/Spearman%27s_rank_correlation_coefficient\n\nIn statistics, Spearman's rank correlation coefficient or Spearman's rho, is a non-parametric measure of correlation – that is, it assesses how well an arbitrary monotonic function could describe the relationship between two variables, without making any other assumptions about the particular nature of the relationship between the variables. Certain other measures of correlation are parametric in the sense of being based on possible relationships of a parameterised form, such as a linear relationship.",
   :name "spearmans-rho"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2552",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/square-devs-from-mean",
   :namespace "incanter.stats",
   :line 2552,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x] [x m]),
   :doc
   "takes either a sample or a sample and a precalculated mean.\n\nreturns the squares of the difference between each observation and the sample mean.",
   :name "square-devs-from-mean"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2565",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sum-of-square-devs-from-mean",
   :namespace "incanter.stats",
   :line 2565,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x] [x m]),
   :doc
   "takes either a sample or a sample and a precalculated mean.\n\nreturns the sum of the squares of the difference between each observation and the sample mean.",
   :name "sum-of-square-devs-from-mean"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2831",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sum-variance-test",
   :namespace "incanter.stats",
   :line 2831,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([vs]),
   :doc
   "the variance of the sum of n independent variables is equal to the sum of their variances.\n\n(variance-independence-test [[1 2 3 4] [1 2 3 4]]) -> 5/2",
   :name "sum-variance-test"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1778",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/sweep",
   :namespace "incanter.stats",
   :line 1778,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Return an array obtained from an input array by sweeping out a\nsummary statistic. Based to R's sweep function.\n\n  Arguments:\n    x is an sequence\n\n\n  Options:\n        :stat (default mean) the statistic to sweep out\n        :fun (defaul minus) the function used to sweep the stat out\n\n  Example:\n\n    (use '(incanter core stats))\n\n    (def x (sample-normal 30 :mean 10 :sd 5))\n    (sweep x) ;; center the data around mean\n    (sweep x :stat sd :fun div) ;; divide data by its sd",
   :name "sweep"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2065",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/t-test",
   :namespace "incanter.stats",
   :line 2065,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   "\nArgument:\n  x : sample to test\n\nOptions:\n  :y (default nil)\n  :mu (default (mean y) or 0) population mean\n  :alternative (default :two-sided) other choices :less :greater\n  :var-equal TODO (default false) variance equal\n  :paired TODO (default false) paired test\n  :conf-level (default 0.95) for returned confidence interval\n\nExamples:\n\n  (t-test (range 1 11) :mu 0)\n  (t-test (range 1 11) :mu 0 :alternative :less)\n  (t-test (range 1 11) :mu 0 :alternative :greater)\n\n  (t-test (range 1 11) :y (range 7 21))\n  (t-test (range 1 11) :y (range 7 21) :alternative :less)\n  (t-test (range 1 11) :y (range 7 21) :alternative :greater)\n  (t-test (range 1 11) :y (conj (range 7 21) 200))\n\nReferences:\n  http://en.wikipedia.org/wiki/T_test\n  http://www.socialresearchmethods.net/kb/stat_t.php",
   :name "t-test"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2161",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/tabulate",
   :namespace "incanter.stats",
   :line 2161,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x & options]),
   :doc
   " Cross-tabulates the values of the given numeric matrix.\n\nReturns a hash-map with the following fields:\n  :table -- the table of counts for each combination of values,\n            this table is only returned if x has two-columns\n  :levels -- a sequence of sequences, where each sequence list\n             the levels (possible values) of the corresponding\n             column of x.\n  :margins -- a sequence of sequences, where each sequence\n              represents the marginal total for each level\n              of the corresponding column of x.\n  :counts -- a hash-map, where vectors of unique combinations\n             of the cross-tabulated levels are the keys and the\n             values are the total count of each combination.\n  :N  -- the grand-total for the contingency table\n\n\nExamples:\n\n  (use '(incanter core stats))\n  (tabulate [1 2 3 2 3 2 4 3 5])\n  (tabulate (sample-poisson 100 :lambda 5))\n\n  (use '(incanter core stats datasets))\n  (def math-prog (to-matrix (get-dataset :math-prog)))\n  (tabulate (sel math-prog :cols [1 2]))\n\n\n  (def data (matrix [[1 0 1]\n                     [1 1 1]\n                     [1 1 1]\n                     [1 0 1]\n                     [0 0 0]\n                     [1 1 1]\n                     [1 1 1]\n                     [1 0 1]\n                     [1 1 0]]))\n  (tabulate data)\n\n\n  (def data (matrix [[1 0]\n                     [1 1]\n                     [1 1]\n                     [1 0]\n                     [0 0]\n                     [1 1]\n                     [1 1]\n                     [1 0]\n                     [1 1]]))\n  (tabulate data)",
   :name "tabulate"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2939",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/tanimoto-coefficient",
   :namespace "incanter.stats",
   :line 2939,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([a b]),
   :doc
   "\n\nhttp://en.wikipedia.org/wiki/Jaccard_index\n\nThe cosine similarity metric may be extended such that it yields the Jaccard coefficient in the case of binary attributes. This is the Tanimoto coefficient. ",
   :name "tanimoto-coefficient"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L1412",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/variance",
   :namespace "incanter.stats",
   :line 1412,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([x]),
   :doc
   "\nReturns the sample variance of the data, x. Equivalent to R's var function.\n\nExamples:\n  (variance (sample-normal 100))\n\nReferences:\n  http://incanter.org/docs/parallelcolt/api/cern/jet/stat/tdouble/DoubleDescriptive.html\n  http://en.wikipedia.org/wiki/Sample_variance#Population_variance_and_sample_variance",
   :name "variance"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a046fa9397aa8ec402475c32729903b3b0bd942e/modules/incanter-core/src/main/clojure/incanter/stats.clj#L2545",
   :wiki-url
   "http://liebke.github.com/incanter//stats-api.html#incanter.stats/within",
   :namespace "incanter.stats",
   :line 2545,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/stats.clj",
   :var-type "function",
   :arglists ([z x y]),
   :doc "\ny is within z of x in metric space.  ",
   :name "within"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/transformations.clj#L82",
   :wiki-url
   "http://liebke.github.com/incanter//transformations-api.html#incanter.transformations/all-keys",
   :namespace "incanter.transformations",
   :line 82,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/transformations.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "returns a set of all the keys from an arbitarily deeply nested map or seq of maps.",
   :name "all-keys"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/transformations.clj#L96",
   :wiki-url
   "http://liebke.github.com/incanter//transformations-api.html#incanter.transformations/bottom-level?",
   :namespace "incanter.transformations",
   :line 96,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/transformations.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "\ngiven a map; is this the bottom level in the map?\n\n (bottom-level? {:a 1}) -> true\n (bottom-level? {:a {:b 1}}) -> false",
   :name "bottom-level?"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/transformations.clj#L127",
   :wiki-url
   "http://liebke.github.com/incanter//transformations-api.html#incanter.transformations/flatten-with",
   :namespace "incanter.transformations",
   :line 127,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/transformations.clj",
   :var-type "function",
   :arglists ([f nested-map]),
   :doc
   "\ntakes an arbitrarily deeply nested map, and flattens it to one level by merging keys. \n\n (flatten-with str {:a {:b {:c 1}}}) -> {\":a:b:c\" 1}",
   :name "flatten-with"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/transformations.clj#L106",
   :wiki-url
   "http://liebke.github.com/incanter//transformations-api.html#incanter.transformations/levels-deep",
   :namespace "incanter.transformations",
   :line 106,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/transformations.clj",
   :var-type "function",
   :arglists ([m]),
   :doc
   "\nreturns the number of levels of depth of nesting for a nested map.\n\n 1  -> 0\n {} -> 0\n {0 1} -> 1\n {1 {0 1}} -> 2\n ...",
   :name "levels-deep"}
  {:source-url
   "http://github.com/liebke/incanter/blob/a05a08841214a2264b83b3b0f4ce9793c206f8a7/modules/incanter-core/src/main/clojure/incanter/transformations.clj#L7",
   :wiki-url
   "http://liebke.github.com/incanter//transformations-api.html#incanter.transformations/table-to-vectors",
   :namespace "incanter.transformations",
   :line 7,
   :file
   "/home/tom/src/clj/autodoc-stable/../autodoc-work-area/incanter/src/modules/incanter-core/src/main/clojure/incanter/transformations.clj",
   :var-type "function",
   :arglists ([z]),
   :doc
   "takes a big vector that is composed of two vectors of alternating membership in the super vector.\n\nsplits out the individual vectors.\n\n [106 \t7\n 86 \t0\n 100 \t27\n 101 \t50\n 99 \t28\n 103 \t29\n 97 \t20\n 113 \t12\n 112 \t6\n 110 \t17]\n\n ->\n\n [[106 86 100 101 99 103 97 113 112 110] [7 0 27 50 28 29 20 12 6 17]]",
   :name "table-to-vectors"})}
