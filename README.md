# 🔁 Palindrome Checker App

A console-based Java application that checks whether a given string is a **palindrome** under different conditions — built to strengthen core programming fundamentals and data structure concepts.

---

## 📖 What is a Palindrome?

A palindrome is a word, phrase, or sequence that reads the same forwards and backwards.

| Input                           | Palindrome?                         |
|---------------------------------|-------------------------------------|
| `racecar`                       | ✅ Yes                               |
| `hello`                         | ❌ No                                |
| `A man a plan a canal Panama`   | ✅ Yes (ignoring spaces & case)      |
| `12321`                         | ✅ Yes                               |
| `12345`                         | ❌ No                                |

---

## 🎯 Objective

Design and implement a console-based Java application that:

- Validates whether a given string is a palindrome
- Handles validation **under different conditions** (case sensitivity, spaces, special characters)
- Reinforces core **Java programming fundamentals** and **data structure concepts**

---

## ✨ Features

- ✅ Basic palindrome check (exact match)
- ✅ Case-insensitive palindrome check
- ✅ Ignore spaces and punctuation
- ✅ Numeric string palindrome check
- ✅ Interactive console menu for selecting check modes
- ✅ Clean, readable output with clear pass/fail results

---

## 🛠️ Tech Stack

| Technology | Details              |
|------------|----------------------|
| Language   | Java                 |
| Type       | Console Application  |
| IDE        | IntelliJ IDEA        |
| Build      | Java compiler (javac)|

---

## 📁 Project Structure

```
PALINDROME-CHECKER-APP/
├── src/
│   └── main/
│       └── *.java       # Core application logic
├── .idea/               # IntelliJ project settings
├── .gitignore
└── PALINDROME_CHECKER_APP.iml
```

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE

### 1. Clone the Repository

```bash
git clone https://github.com/NamanRai64/PALINDROME-CHECKER-APP.git
cd PALINDROME-CHECKER-APP
```

### 2. Run via IntelliJ IDEA

1. Open the project folder in IntelliJ IDEA.
2. Let IntelliJ index the project.
3. Navigate to `src/` and find the main class.
4. Click **Run** ▶️ or press `Shift + F10`.

### 3. Run via Terminal

```bash
# Compile
javac src/*.java -d out/

# Run
java -cp out/ Main
```

---

## 💻 Sample Console Output

```
=============================
   PALINDROME CHECKER APP
=============================
Enter a string: racecar

[1] Exact Check
[2] Case-Insensitive Check
[3] Ignore Spaces & Punctuation

Choose check type: 1

➡ Input   : racecar
✅ Result  : "racecar" IS a palindrome!

------------------------------
Enter another string? (yes/no): yes

Enter a string: A man a plan a canal Panama
Choose check type: 3

➡ Input   : A man a plan a canal Panama
✅ Result  : IS a palindrome! (ignoring spaces & case)
```

---

## 🧠 Concepts Covered

- String manipulation in Java
- Two-pointer technique
- StringBuilder / StringBuffer for reversal
- Stack-based palindrome verification
- Recursion for palindrome checking
- Character filtering (regex)
- Console I/O with `Scanner`

---

## 🤝 Contributing

Contributions and improvements are welcome!

1. Fork the repository
2. Create a new branch (`git checkout -b feature/new-check-mode`)
3. Commit your changes (`git commit -m 'Add alphanumeric-only palindrome check'`)
4. Push to the branch (`git push origin feature/new-check-mode`)
5. Open a Pull Request

---

## 📄 License

This project is open source. See the repository for details.

---

## 👤 Author

**Naman Rai** — [@NamanRai64](https://github.com/NamanRai64)

---

> *"Was it a car or a cat I saw?"* — A classic palindrome 🚗🐱
