# 自定义start

##### 注解解释,下面这些注解在自定义starter是可能会用到。
>- @Conditional：按照一定的条件进行判断，满足条件给容器注册bean
>- @ConditionalOnMissingBean：给定的在bean不存在时,则实例化当前Bean
>- @ConditionalOnProperty：配置文件中满足定义的属性则创建bean，否则不创建
>- @ConditionalOnBean：给定的在bean存在时,则实例化当前Bean
>- @ConditionalOnClass： 当给定的类名在类路径上存在，则实例化当前Bean
>- @ConditionalOnMissingClass ：当给定的类名在类路径上不存在，则实例化当前Bean