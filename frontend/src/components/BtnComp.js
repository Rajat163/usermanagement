import React from "react";

export default function BtnComp(props) {
  return (
    <div>
      <button
        style={{ margin: 10 }}
        type="button"
        class="btn btn-outline-primary"
      >
        {props.text}
      </button>
    </div>
  );
}
