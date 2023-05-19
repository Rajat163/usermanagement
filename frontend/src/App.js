import { Route, Routes } from "react-router-dom";
import Customer from "./components/Customer";
import CustomerCreate from "./components/CustomerCreate";
import CustomerDelete from "./components/CustomerDelete";
import CustomerFind from "./components/CustomerFind";
import CustomerUpdate from "./components/CustomerUpdate";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Customer />} />
      <Route path="/create-customer" element={<CustomerCreate />} />
      <Route path="/find-customer" element={<CustomerFind />} />
      <Route path="/update-customer" element={<CustomerUpdate/>} />
      <Route path="/delete-customer" element={<CustomerDelete/>} />
    </Routes>
  );
}

export default App;
