import React, { useEffect, useState } from "react";

export default function CustomerShow(props) {
    const [custId,setId] = useState()
    useEffect(()=>{
    setId(props.id)
  },props.id)
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
                <p>Customer id : {custId} </p>
            </div>
          </div>
        </div>
      </div>
  );
}
