class TextEditor:
    def __init__(self):
        self.s = ''
        self.pointer = 0
    def cursorLeft(self, k: int):
        self.pointer = max(0, self.pointer - k)
        start = max(0, self.pointer-10)
        return self.s[start:self.pointer]
    def cursorRight(self, k: int):
        self.pointer = min(len(self.s), self.pointer + k)
        start = max(0, self.pointer - 10)
        return self.s[start:self.pointer]
    def addText(self, text: str):
        self.s = self.s[:self.pointer] + text + self.s[self.pointer:]
        self.pointer += len(text)
    def deleteText(self, k: int) -> int:
        new_pointer = max(0, self.pointer - k)
        counter = k if self.pointer - k >= 0 else self.pointer
        self.s = self.s[:new_pointer] + self.s[self.pointer:]
        self.pointer = new_pointer
        return counter
    
    