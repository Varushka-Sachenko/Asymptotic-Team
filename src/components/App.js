import React from "react";
import Header from "./Header";
import ClientsLists from "./ClientsList";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import CurrentClient from "./CurrentClient";

import EmptyList from "./EmptyList";
function App() {
  const [clients, setClients] = React.useState([{_id: 3,
    name: "Петров Петр Семенович",
    birth_date: "12.04.1992",
    city: "МОСКВА",
    marital_status: 'ЖЕНАТ',
    children_amount: "0",
    role_: "ЗАЕМЩИК",
    dsti: 175900,
    abc: "NO",
    is_client_of_the_bank: 1,
    email: "mail@example.com",
    conditions: {
      summ: 3800000,
      income_type: "ИНОЕ",
      is_docs_ok: 1,
      work_term: 1,
      is_main: 1}
  },
  {_id: 2,
    name: "Иванов Иван Иванович",
    birth_date: "2.04.1962",
    city: "МОСКВА",
    marital_status: 'ЖЕНАТ',
    children_amount: "0",
    role_: "ЗАЕМЩИК",
    dsti: 17590,
    abc: "NO",
    is_client_of_the_bank: 1,
    email: "mail@example.com",
    conditions: {
      summ: 880000,
      income_type: "ИНОЕ",
      is_docs_ok: 1,
      work_term: 1,
      is_main: 1}
  },
  ]); // clients list
  // setClients({_id: 1, name: "Иванов Иван Иванович", conditions: {age: 85, incomes: "Иное", summ: "10 млн"}}, {_id: 2, name: "Иванов Петр Иванович", conditions: {age: 25, incomes: "Иное", summ: "1 млн"}})
  const [inWork, setInWork] = React.useState();
  const [statusButton1, setStatusButton1] = React.useState(
    "clientList__item_active"
  );
  const [statusButton2, setStatusButton2] = React.useState("");

  const handleToMainClick = () => {
    setStatusButton1("clientList__item_active");
    setStatusButton2("");
  };

  const handleCardClick = (card) => {
    setInWork(card);
    console.log(inWork)
  };
  {
    console.log(inWork ? 1 : 0);
  }
  return (
    <Router>
      <div className="App">
        <Header status1={statusButton1} status2={statusButton2}></Header>
        <Routes>
          <Route
            exact
            path="/"
            element={
              <ClientsLists
                clients={clients}
                onCardClick={handleCardClick}
              ></ClientsLists>
            }
          ></Route>
          <Route path="/processing"></Route>
          <Route
            path="/current"
            element={
              inWork ? (
                <CurrentClient client={inWork}></CurrentClient>
              ) : (
                <EmptyList onClick={handleToMainClick}></EmptyList>
              )
            }
          ></Route>
        </Routes>
      </div>
    </Router>
  );
}

export default App;
