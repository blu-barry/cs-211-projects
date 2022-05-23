
class SSNCharacterException extends Exception {
  static final long serialVersionUID = -3387516993124229949L;
  private int code;

    public SSNCharacterException(String message, int code) {
        super(message);
        this.setCode(code);
    }

    public SSNCharacterException(String message, int code, Throwable cause) {
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
