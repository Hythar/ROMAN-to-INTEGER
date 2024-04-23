# RomanNumeral Converter for Java

Welcome to the RomanNumeral Converter project! This Java application translates Roman numerals to their integer value counterparts with ease and precision. Utilizing a simple and effective mapping system, the converter supports standard Roman numeral conventions including subtractive notation.

## Description

This project includes a robust Java class `RomanNumeral` that encapsulates the logic for converting Roman numerals to integers. Accompanying this class is a comprehensive suite of JUnit tests `RomanNumeralTest` ensuring the correctness of the conversion under various scenarios including single digit conversions, subtractive notations, and complex Roman numeral strings.

## Getting Started

To get a copy of this project up and running on your local machine for development and testing purposes, follow these simple steps.

### Prerequisites

Ensure you have the following installed:
- Java Development Kit (JDK) 1.8 or later
- Maven 3.6 or later

### Installation

1. Clone the repository to your local machine:
   ```sh
   git clone https://github.com/yourusername/roman-to-integer-converter.git
   ```
2. Navigate to the project directory:
   ```sh
   cd roman-to-integer-converter
   ```

## Usage

After installing, you can use the RomanNumeral Converter in your Java programs like so:

```java
RomanNumeral romanNumeral = new RomanNumeral();
int result = romanNumeral.romanToInt("MCMXCIV");
System.out.println("The Roman numeral MCMXCIV equals " + result);
```

## Running the Tests

To execute the unit tests and verify that everything is working as expected:

```sh
mvn test
```
