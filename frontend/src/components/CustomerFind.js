import { render } from "@testing-library/react";
import React from "react";
import CustomerShow from "./CustomerShow";

export default function CustomerFind() {
  async function handleSubmit() {
    let customerId = document.getElementById("customerID").value;
    const url = `http://localhost:8080/api/v1/customers/${customerId}`;
    const response = await fetch(url);
    const data = await response.json();
    render(<CustomerShow customer={data} />);
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
            <button
              className="btn btn-primary"
              type="button"
              onClick={handleSubmit}
            >
              Submit form
            </button>
          </div>
        </div>
      </form>
    </div>
  );
}
