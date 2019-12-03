import random
import easygui as g
g.msgbox('嗨，欢迎进入宝贝冲冲冲系统')
secret = random.randint(1,10)
msg = '不妨猜一下zz心中所想的数字（1~10）：'
title = '数字小游戏'
guess = g.integerbox(msg,title,lowerbound=1,upperbound=10)
while True:
    if guess == secret:
        g.msgbox('？？？？？？，这都猜得到')
        g.msgbox('溜了溜了')
        break
    else:
        if guess > secret:
            g.msgbox('哥，大了大了')
        else:
            g.msgbox('弟弟大胆点')
        guess = g.integerbox(msg,title,lowerbound=1,upperbound=10)
g.msgbox('游戏结束QAQ')
