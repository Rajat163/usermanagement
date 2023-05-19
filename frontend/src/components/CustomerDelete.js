import React from 'react'

export default function CustomerDelete() {
    const handleSubmit = () => {
        let customerId = document.getElementById("customerID").value
        console.log(`delete customer with id as ${customerId}`)
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
