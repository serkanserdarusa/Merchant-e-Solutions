$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/AutomatedTest.feature");
formatter.feature({
  "name": "Create a new user",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create new user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user click new user button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_new_user_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Username\" as \"serkanserdar61\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Password\" as \"ser615534\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"Email\" as \"serkanserdarusa@gmail.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click \"Create User\" button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Filters with Username",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select \"\u003cdropdown\u003e\" and enters \"\u003ctext\u003e\" from \"Username\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.examples({
  "name": "dropdown and text",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "dropdown",
        "text"
      ]
    },
    {
      "cells": [
        "Contains",
        "serdar61"
      ]
    },
    {
      "cells": [
        "Equals",
        "serkanserdar61"
      ]
    },
    {
      "cells": [
        "Starts with",
        "serkan"
      ]
    },
    {
      "cells": [
        "Ends with",
        "dar61"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Contains\" and enters \"serdar61\" from \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Equals\" and enters \"serkanserdar61\" from \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Starts with\" and enters \"serkan\" from \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Ends with\" and enters \"dar61\" from \"Username\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Filters with Email",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user select \"\u003cemail\u003e\" and enters \"\u003ctext1\u003e\" from \"Email\"",
  "keyword": "Then "
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.examples({
  "name": "Email and text",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "text1"
      ]
    },
    {
      "cells": [
        "ssssssss",
        "serdarusa"
      ]
    },
    {
      "cells": [
        "Equals",
        "serkanserdarusa@gmail.com"
      ]
    },
    {
      "cells": [
        "Starts with",
        "serkan"
      ]
    },
    {
      "cells": [
        "Ends with",
        "darusa@gmail.com"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"ssssssss\" and enters \"serdarusa\" from \"Email\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Equals\" and enters \"serkanserdarusa@gmail.com\" from \"Email\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Starts with\" and enters \"serkan\" from \"Email\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "NewUser_Step.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the Users button",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_click_the_Users_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filters with Email",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_test"
    }
  ]
});
formatter.step({
  "name": "user select \"Ends with\" and enters \"darusa@gmail.com\" from \"Email\"",
  "keyword": "Then "
});
formatter.match({
  "location": "NewUser_Step.user_select_and_enters(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click Filter button",
  "keyword": "And "
});
formatter.match({
  "location": "NewUser_Step.user_click_Filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});