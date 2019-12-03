user_data = {}

def new_user():
    prompt = '请输入用户名：'
    while True:
        name = input(prompt)
        if name in user_data:
            prompt = '此用户名已经被使用，请重新输入：'
            continue
        else:
            break

    passwd = input('请输入密码：')
    user_data[name] = passwd
    print('注册成功，赶紧试试登陆吧QAQ')

def old_user():
    prompt = '请输入用户名：'
    while True:
        name = input(prompt)
        if name not in user_data:
            prompt = "您输入的用户命不存在，请重新输入"
            continue
        else:
            break


    passwd = input('请输入密码：')
    pwd = user_data.get(name)
    if passwd == pwd:
        print('欢迎进入宝贝冲冲冲系统，请点击右上角x结束程序')
    else:
        print('宝贝，密码错误！')
def showmenu():
    prompt = '''
|--- 新建账户:N/n ---|
|--- 登陆账户:E/e----|
|--- 退出程序:Q/q ---|
|--- 请输入指令代码:'''
    while True:
        chosen = False
        while not chosen:
            choice = input(prompt)
            if choice not in 'NnEeQq':
                print('你输入的指令代码有误，请重新输入：')
            else:
                chosen = True
        if choice == 'q' or choice =='Q':
            break
        if choice == 'n' or choice =='N':
            new_user()
        if choice == 'e' or choice =='E':
            old_user()

showmenu()
