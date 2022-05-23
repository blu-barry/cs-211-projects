/*
* Student name:  Michael Barry
* Completion date: 22 May 2022
*/

class SSNLengthException extends Exception {
  static final long serialVersionUID = -3387516993124229948L;
  private int code;

    public SSNLengthException(String message, int code) {
        super(message);
        this.setCode(code);
    }

    public SSNLengthException(String message, int code, Throwable cause) {
        super(message, cause);
        this.setCode(code);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
