import React, { useEffect, useState } from "react";

export default function CustomerShow(props) {
  const custId = props.id;
  const [customer, setCustomer] = useState();

  function fetchCustomer() {
    const url = `http://localhost:8080/api/v1/customers/${custId}`;
   fetch(url).then((response) => {
    response.json().then((data)=>{
      setCustomer(data)
      console.log(customer)
    })
   })
  }

  useEffect(() => {
    fetchCustomer()
  });
  return (
    <div>
      <div className="modal-dialog" role="document">
        <div className="modal-content">
          <div className="modal-header">
            <h5 className="modal-title" id="exampleModalLabel">
              Customer Details
            </h5>
            <button
              type="button"
              className="close"
              data-dismiss="modal"
              aria-label="Close"
            >
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div className="modal-body">
            <p>Customer Name : </p>
          </div>
        </div>
      </div>
    </div>
  );
}
