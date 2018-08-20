1. start the application
2. open postman
3. create a http request: <b>http://localhost:9090/saveEmp</b>  with post method and pass the data
    1. {
      "company":["Cloud Dreams","Sprin Technosys","Anthem Cellutions","Anthem Bio Science","Infosys"],
      "exp":[6,6,35,1,6]
      }
      
    2. {
        "company":["Dreams","Technosys","Cellutions","Science","Info"],
             "exp":[6,6,35,1,6]
        }

4. to cross verify this <b>http://localhost:9090/getEmp</b>