import React from "react";

export default function CustomerCreate() {
  const handleSubmit = () => {
    console.log("Form submitted..");
  };

  return (
    <div>
      <form>
        <div className="form-group">
          <div className="col-3" style={{ margin: 10 }}>
            <label>First Name:</label>
            <input type="text" className="form-control" id="firstname" />
          </div>
          <div className="col-3" style={{ margin: 10 }}>
            <label>Last Name:</label>
            <input type="text" className="form-control" id="lastname" />
          </div>
          <div className="col-3" style={{ margin: 10 }}>
            <label>Age :</label>
            <input type="text" className="form-control" id="age" />
          </div>
          <div className="col-3" style={{ margin: 10 }}>
            <label>Orders :</label>
            <input type="text" className="form-control" id="orders" />
          </div>
          <div className="col-3" style={{ margin: 10 }}>
            <button
              className="btn btn-primary"
              type="submit"
              onClick={handleSubmit}
            >
              Submit
            </button>
          </div>
        </div>
      </form>
    </div>
  );
}
