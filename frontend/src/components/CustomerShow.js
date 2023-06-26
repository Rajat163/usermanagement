import React from "react";

export default function CustomerShow(props) {
  const customer = props.customer;
  console.log(customer);
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
              data-bs-dismiss="modal"
              aria-label="Close"
            >
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div className="modal-body">
            <p>
              Customer Name : {customer.firstName} {customer.lastName}{" "}
            </p>
            <p>Customer Age: {customer.age}</p>
            <p>Orders : {customer.orders}</p>
          </div>
        </div>
      </div>
    </div>
  );
}
