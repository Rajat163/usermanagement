import React from "react";

export default function CustomerFind() {
    const handleSubmit = () =>{
        console.log('find customer')
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
