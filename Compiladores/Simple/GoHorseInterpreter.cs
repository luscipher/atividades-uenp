using System;
using System.Collections.Generic;

namespace GoHorseInterpreter
{
    public class Interpreter
    {
        // Token types
        enum TokenType {
            EOL, NUMBER, INT, FLOAT_NUM, INTEGER, FLOAT, BOOLEAN,
            BOOL_TRUE, BOOL_FALSE, STRING, ARRAY, CUSTOM_TYPE, REFERENCE,
            READ, WRITE, ID, ARRAY_SIZE, COMMA, COLON, ASSIGN, LPAREN,
            RPAREN, LBRACKET, RBRACKET, PLUS, MINUS, MULT, DIV, MOD,
            AND, OR, NOT, EQ, NEQ, LT, GT, LTE, GTE
        }

        // Token class
        class Token {
            public TokenType type;
            public string value;

            public Token(TokenType type, string value) {
                this.type = type;
                this.value = value;
            }

            public override string ToString() {
                return String.Format("Token({0}, {1})", type, value);
            }
        }

        // Lexer class
        class Lexer {
            private string text;
            private int pos;
            private char currentChar;

            public Lexer(string text) {
                this.text = text;
                this.pos = 0;
                this.currentChar = text[pos];
            }

            private void error() {
                throw new Exception("Invalid character: " + currentChar);
            }

            private void advance() {
                pos++;
                if (pos > text.Length - 1) {
                    currentChar = '\0'; // EOF
                } else {
                    currentChar = text[pos];
                }
            }

            private char peek() {
                int peekPos = pos + 1;
                if (peekPos > text.Length - 1) {
                    return '\0'; // EOF
                } else {
                    return text[peekPos];
                }
            }

            private void skipWhiteSpace() {
                while (currentChar != '\0' && char.IsWhiteSpace(currentChar)) {
                    advance();
                }
            }

            private string integer() {
                string result = "";
                while (currentChar != '\0' && char.IsDigit(currentChar)) {
                    result += currentChar;
                    advance();
                }
                return result;
            }

            private string floatNum() {
                string result = integer();
                if (currentChar == '.') {
                    result += currentChar;
                    advance();
                    result += integer();
                }
                return result;
            }

            private string stringLiteral() {
                string result = "";
                advance();
                while (currentChar != '"' && currentChar != '\0') {
                    result += currentChar;
                    advance();
                }
                if (currentChar == '"') {
                    advance();
                } else {
                    error();
                }
                return result;
            }

            private Token id() {
                string result = "";
                while (currentChar != '\0' && (char.IsLetterOrDigit(currentChar) || currentChar == '_')) {
                    result += currentChar;
                    advance();
                }
                switch (result) {
                    case "integer":
                        return new Token(TokenType.INTEGER, result);
                    case "float":
                        return new Token(TokenType.FLOAT, result);
                    case "boolean":
                        return new Token(TokenType.BOOLEAN, result);
                    case "true":
                        return new Token(TokenType.BOOL_TRUE, result);
                    case "false":
                        return new Token(TokenType.BOOL_FALSE, result);
                    case "array":
                        return new Token(TokenType.ARRAY, result);
                    case "readln":
                        return new Token(TokenType.READ, result);
                    case "writeln":
                        return new Token(TokenType.WRITE, result);
                    default:
                        return new Token(TokenType.ID, result);
                    }
                }
            }
        }
    }