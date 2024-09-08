import React, { useState, useEffect } from 'react';
import './App.css';

const Counter = () => {
  const [count, setCount] = useState(0);
  const [history, setHistory] = useState([0]);
  const [currentStep, setCurrentStep] = useState(0);

  useEffect(() => {
    setHistory(history.slice(0, currentStep + 1));
    setHistory([...history, count]);
    setCurrentStep(currentStep + 1);
  }, [count]);

  const increment = () => {
    if (count < 150) {
      setCount(count + 1);
    }
  };

  const decrement = () => {
    if (count > 0) {
      setCount(count - 1);
    }
  };

  const undo = () => {
    if (currentStep > 0) {
      setCurrentStep(currentStep - 1);
      setCount(history[currentStep - 1]);
    }
  };

  const redo = () => {
    if (currentStep < history.length - 1) {
      setCurrentStep(currentStep + 1);
      setCount(history[currentStep + 1]);
    }
  };

  const progress = (count / 150) * 100;

  return (
    <div className="counter-container">
      <h1>Counter: {count}</h1>
      <div className="button-group">
        <button onClick={decrement}>Decrement</button>
        <button onClick={increment}>Increment</button>
      </div>
      <div className="button-group">
        <button onClick={undo}>Undo</button>
        <button onClick={redo}>Redo</button>
      </div>
      <div className="progress-bar">
        <div
          className="progress-fill"
          style={{ width: `${progress}%`, transition: 'width 0.3s ease-in-out' }}
        ></div>
      </div>
    </div>
  );
};

export default Counter;
