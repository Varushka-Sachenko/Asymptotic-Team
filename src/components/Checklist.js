import React from "react";
import Client from "./Client";
function Checklist(props) {

  return (
    <section className="checklist">
        <h2 className="checklist__title">Чек-лист андеррайтера</h2>
        <h3 className="checklist__part">Анализ кредитной истории</h3>
      <form className="checklist__form">
        <label className="checklist__input">
          Наличие кредитной истории
          <input className="input_check" type="checkbox" name="step" />
        </label>
        <label className="checklist__input">
          Оценка кредитной истории
          <input className="input_check" type="checkbox" name="step" />
        </label>
        <label className="checklist__input">
          Оценка характера займов
          <input className="input_check" type="checkbox" name="step" />
        </label>
        <label className="checklist__input">
            Проверка просрочек
          <input className="input_check" type="checkbox" name="step" />
        </label>
        </form>
        <h3 className="checklist__part">Анализ заявки</h3>
        <form className="checklist__form">
        <label className="checklist__input">
          Оценка платежеспособности
          <input className="input_check" type="checkbox" name="step" />
        </label>
        <label className="checklist__input">
          Проверка официального источника дохода
          <input className="input_check" type="checkbox" name="step" />
        </label>
        <label className="checklist__input">
          Оценка состояния дополнительного дохода
          <input className="input_check" type="checkbox" name="step" />
        </label>
        <label className="checklist__input">
            Проверка действующих обязательств по отчету БКИ
          <input className="input_check" type="checkbox" name="step" />
        </label>
        </form>
    </section>
  );
}

export default Checklist;
