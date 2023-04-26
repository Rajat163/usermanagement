import React from "react";
import BtnComp from "./BtnComp";

export default function Customer() {
  return (
    <div style={{ columnCount: 4}}>
      <div>
        <BtnComp text="Create customer" />
      </div>
      <div>
        <BtnComp text="Find customer" />
      </div>
      <div>
        <BtnComp text="Update customer" />
      </div>
      <div>
        <BtnComp text="Delete customer" />
      </div>
    </div>
  );
}
