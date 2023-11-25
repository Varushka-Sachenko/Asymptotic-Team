import React from "react";
import Client from "./Client";

function ClientsLists() {
  return (
    <section className="clientList">
      <div className="clientList__menu">
        <h2 className="clientList__item clientList__item_active">
          Новые заявки
        </h2>
        <h2 className="clientList__item">Дозапрос информации</h2>
        <h2 className="clientList__item">В работе</h2>
      </div>
      <div className="clients__cards">
        <Client></Client>
        <Client></Client>
        <Client></Client>
        <Client></Client>
        <Client></Client>
      </div>
    </section>
  );
}

export default ClientsLists;
