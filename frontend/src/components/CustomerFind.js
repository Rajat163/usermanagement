import React from "react";

export default function CustomerFind() {
     async  function handleSubmit() {
        let customerId = document.getElementById("customerID").value
        console.log(`find customer with id as ${customerId}`)
        let url = `http://localhost:8080/api/customers/${customerId}`
        await fetch(url).then(response => {
          return response.json()
        }).then(data => {
          console.log(data)
        }).catch(reason => {
          console.log('Invalid user id')
        })
    }
  return (
    <div>
      <form>
        <div className="form-group">
          <div className="col-3" style={{ margin: 10 }}>
            <label>Customer ID:</label>
            <input type="text" className="form-control" id="customerID" />
          </div>
          <div className="col-3" style={{ margin: 10 }}>
          <button className="btn btn-primary" type="button" onClick={handleSubmit}>Submit form</button>
          </div>
        </div>
      </form>

      
    </div>
  );
}
