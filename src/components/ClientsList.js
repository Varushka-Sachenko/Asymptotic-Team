import React from "react";
import Client from "./Client";
import CurrentClient from "./CurrentClient";
function ClientsLists(props) {
  const handleClick = (card) =>{ props.onCardClick(card);} 

  return (
    <section className="clientList">
      <div className="clients__cards">
        {/* {console.log(props.clients)} */}
        {props.clients.map((element) => {
          // console.log(element)
          return (
            <Client
              key={element._id}
              client={element}
              onCardClick={handleClick}
            />
          );
        })}
      </div>
    </section>
  );
}

export default ClientsLists;
