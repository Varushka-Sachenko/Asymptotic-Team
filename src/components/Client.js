import React from "react";
import ageIcon from "../images/age.png";
import summIcon from "../images/hand.png";
import incomeIcon from "../images/save-money.png";
function Client() {
  return (
    <div className="client">
      <h3 className="client__name">Иванов Иван Иванович</h3>
      <button className="client__button"></button>
      <div className="client__conditions">
        <div className="conditions__item">
          <img
            className="condition__image"
            src={summIcon}
            title="Сумма кредита"
            alt="Сумма кредита "
          ></img>
          <span className="conditions__span">10 млн</span>
        </div>
        <div className="conditions__item">
          <img className="condition__image" src={ageIcon} title="Возраст" alt="Возраст "></img>
          <span className="conditions__span">85 лет</span>
        </div>
        <div className="conditions__item">
          <img
            className="condition__image"
            src={incomeIcon}
            title="Источник доходов"
            alt="Источник доходов "
          ></img>
          <span className="conditions__span">Иное</span>
        </div>
      </div>
    </div>
  );
}

export default Client;
