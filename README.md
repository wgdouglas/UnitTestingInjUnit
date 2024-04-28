> # Unit Testing with jUnit

* This project covers the basic SEA approach of testing
* The business runs out of some sizes of boxes and requires that pizza orders that contain anything other than large or extra-large must be discarded.
  * The current codebase relies on isValidOrder, a method that must be refactored for the rule above.
      * An Order object, serialized as JSON, looks as follows:

`{
  "customerName" : "John Nash",
  "address" : {
    "street" : "2000 Awesome Avenue",
    "city" : "Boulder",
    "state" : "Colorado"
  },
  "pizzas": [
    { "size" : "small", "toppings" : ["peppers", "onions", "olives"] },
    { "size" : "medium", "toppings" : [] },
    { "size" : "extra-large", "toppings" : [""] }
  ] 
}`
* The above order is invalid under the new rule because it contains one small and one medium pizza.