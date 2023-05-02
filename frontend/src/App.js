import { Route, Routes } from "react-router-dom";
import Customer from "./components/Customer";
import CustomerCreate from "./components/CustomerCreate";
import CustomerFind from "./components/CustomerFind";

function App() {
  return (
    <Routes>
      <Route path="/" element={<Customer />} />
      <Route path="/create-customer" element={<CustomerCreate />} />
      <Route path="/find-customer" element={<CustomerFind />} />
    </Routes>
  );
}

export default App;
