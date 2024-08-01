let display = document.getElementById('display');
let currentInput = '';
let previousInput = '';
let operation = null;
let decimalAdded = false;

function appendNumber(number) {
    currentInput += number;
    display.value = currentInput;
}

function appendDecimal() {
    // Add a decimal point if there isn't one already
    if (!decimalAdded) {
        currentInput += '.';
        decimalAdded = true;
        display.value = currentInput;
    }
}

function setOperation(op) {
    if (currentInput === '') return;
    if (previousInput !== '') {
        calculateResult();
    }
    operation = op;
    previousInput = currentInput;
    currentInput = '';
    decimalAdded = false; // Reset decimal flag for new input
}

function calculateResult() {
    let result;
    const prev = parseFloat(previousInput);
    const current = parseFloat(currentInput);
    if (isNaN(prev) || isNaN(current)) return;
    switch (operation) {
        case '+':
            result = prev + current;
            break;
        case '-':
            result = prev - current;
            break;
        case '*':
            result = prev * current;
            break;
        case '/':
            result = prev / current;
            break;
        default:
            return;
    }
    currentInput = result.toString();
    operation = null;
    previousInput = '';
    display.value = currentInput;
    decimalAdded = currentInput.includes('.'); // Set the flag based on the result
}

function clearDisplay() {
    currentInput = '';
    previousInput = '';
    operation = null;
    decimalAdded = false;
    display.value = '';
}
