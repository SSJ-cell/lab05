class FourBasicOpt:
    """
    For the four basic arithmetic operations.
    Class can be used to add, subtract, divide and multiply.
    """
    def add(self, x, y):
        return x + y

    def subtract(self, x, y):
        return x - y

    def divide(self, x, y):
        if y == 0:
            return 0  # 0으로 나눌 경우 예외 처리
        return x / y

    def multiply(self, x, y):
        return x * y