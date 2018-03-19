1：Linux->基本命令

	ls -> 查看当前目录 只显示文件名
	ll -> 查看当前目录 显示详细信息
	pwd -> 显示当前所在路径
	ls / -> 查看所指目录文件
	ll / -> 查看所指文件的详细信息
	cd ->切换目录
	mkdir 文件名 -> 创建文件夹
	touch 文件 -> 创建文件
	vi 文件名-> 编辑文件内容
	i -> 插入信息
	esc :wq! -> 退出并保存
	rm -> 删除询问
	rm -rf -> 强制删除
	echo -> 输出打印在公屏上
	> -> 重定向
	>> ->追加内容
	
	
	
2：Linux->防火墙命令

	systemctl stop firewalld.service 停止防火墙
	systemctl disable firewalld.service 禁止开机启动
	systemctl status firewalld.service 查看防火墙状态
	
3：Linux->权限操作

	三组：拥有者权限  所出组权限 	其它用户权限
	
	r:可写
	w:可读
	x:可执行
	u:拥有者
	g；组
	o：其它用户
	
	chmod g-x 文件名 所属组去掉可执行权限
	chmod g+w 文件名 所属组加可写权限
	chmod 777 文件名 所有人都有权限
	chmod 700 拥有者具有权限 其它没有
	chmod 664 恢复之前的权限
	