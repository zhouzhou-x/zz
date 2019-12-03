print("|--- 欢迎进入通讯录程序 ---|")
print("|--- 1：查询联系人资料  ---|")
print("|--- 2：插入新的联系人  ---|")
print("|--- 3：删除已有联系人  ---|")
print("|--- 4：退出通讯录程序  ---|")

contacts = {'闫':'1','帅':'2','舟':'3'}

while 1:
    instr = int(input('\n请输入相关得代码指令：'))

    if instr == 1:
        name = input('请输入联系人姓名：')
        if name in contacts:
            print(name + ':'+ contacts[name])
        else:
            print('你输入的联系人不再通讯录里')

    if instr == 2:
        name = input('请输入联系人姓名：')
        if name in contacts:
            print('你输入得姓名已经存在于通讯录里面-->>',end='')
            print(name +'：' + contacts[name])
            if input('是否修改用户资料（YEZ/NO）;') =='YES':
                contacts[name] = input("请输入用户电话：")
        else:
            contacts[name] = input('请输入用户联系电话：')

    if instr == 3:
        name = input('请输入联系人姓名：')
        if name in contacts:
            del(contacts[name])
        else:
            print('您输入得联系人不存在。')
    if instr == 4:
        break

print('|--- 感谢使用通讯录程序 ---|')
            
                
