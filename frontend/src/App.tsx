import DataTable from "components/DataTable";
import Footer from "components/Footer";
import NavBar from "components/NavBar";


function App() {
  return (
    <>
      <div>
        <NavBar />
        <div className="container">
          <DataTable/>
        </div>
      </div>
      <Footer/>
    </>
  );
}

export default App;
