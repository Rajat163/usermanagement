import React from "react";
import { useNavigate } from "react-router-dom";

export default function Customer() {
  const navigate = useNavigate()

  const handleCreateBtnClick = () => {
    console.log("create customer is clicked....");
    navigate("/create-customer")
  };
  const handleFindBtnClick = () => {
    console.log("Find customer is clicked....");
    navigate("/find-customer")
  };

  const handleUpdateBtnClick = () => {
    console.log("Update customer is clicked....");
  };

  const handleDeleteBtnClick = () => {
    console.log("Delete customer is clicked....");
  };

  return (
    <div style={{ marginTop: 20, columnCount: 4 }}>
      <div>
        <button
          type="button"
          className="btn btn-primary"
          onClick={handleCreateBtnClick}
        >
          Create Customer
        </button>
      </div>
      <div>
        <button
          type="button"
          className="btn btn-primary"
          onClick={handleFindBtnClick}
        >
          Find Customer
        </button>
      </div>
      <div>
        <button
          type="button"
          className="btn btn-primary"
          onClick={handleUpdateBtnClick}
        >
          Update Customer
        </button>
      </div>
      <div>
        <button
          type="button"
          className="btn btn-primary"
          onClick={handleDeleteBtnClick}
        >
          Delete Customer
        </button>
      </div>
    </div>
  );
}
