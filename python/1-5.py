class Ticket():
    def  __init__(self,weekend=False,child=False):
        self.exp = 100
        if weekend:
            self.inc = 1.2
        else:
            self.inc = 1
        if child:
            self.discount = 0.5
        else:
            self.disconut = 1
        def calcPrice(self,num):
            return self.exp * self.inc * self.disconut * num
